package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public List<ProfessorDTO> findProfessorListByDeptno(int deptno) {
		
		conn = DBConnectionManager.connectDB();
		
		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();
		
		// TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate
		// Java >> rs.getString("hiredate") >> Query에서 TO_CHAR로 작성시 col이름 hiredate로 바꿔줘야함
		String sqlQuery = " select profno, name, id, position, pay, deptno, "
				+ " TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate "
				+ " from professor "
				+ " where deptno = ? ";
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProfessorDTO p = new ProfessorDTO();
				
				p.setProfno(rs.getInt("profno"));
				p.setName(rs.getString("name"));
				p.setId(rs.getString("id"));
				p.setPosition(rs.getString("position"));
				p.setPay(rs.getInt("pay"));
				p.setDeptno(rs.getInt("deptno"));
				
				//java.sql.Date -> java.time.LocalDateTime
				//p.setHiredate(rs.getDate("hiredate").toLocalDate());
				
				//DB (Date, Timestamp) -> rs.getTimestamp
				//p.setHiredate(ConvertDateUtil.convertTimestampToLocalDataTime(rs.getTimestamp("hiredate")));
				//timestamp -> LocalDateTime
				
				p.setHiredate(rs.getString("hiredate"));
				
				professorList.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		
		return professorList;
	}

}
