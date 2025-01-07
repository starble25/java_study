package practice.Practice32;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	// 기본 student 전체 조회 메소드
	public List<StudentDTO> findStudentList() {
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = "select * from student";
		
//		String sqlQuery = "select studno, name, ... , TO_CHAR(birthday, 'yyyyMMdd') birthday, ..."
//				+ "from student";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				studentList.add(new StudentDTO(
						rs.getInt("studno"), 
						rs.getString("name"), 
						rs.getString("id"), 
						rs.getInt("grade"), 
						rs.getString("jumin"), 
						
						//timestamp -> LocalDateTime -> String
						ConvertDateUtil.convertLocalDateTimeToString(ConvertDateUtil.convertTimestampToLocalDataTime(rs.getTimestamp("birthday"))),
//						rs.getString("birthday"), 
						rs.getString("tel"), 
						rs.getInt("height"), 
						rs.getInt("weight"), 
						rs.getInt("deptno1"), 
						rs.getInt("deptno2"), 
						rs.getInt("profno") 
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}
	
	// 학년(grade)을 받아서 해당 학년 student 조회 메소드
	public List<StudentDTO> findStudentListByGrade(int grade) {
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = "select * from student where grade = ?";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, grade);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				studentList.add(new StudentDTO(
						rs.getInt("studno"), 
						rs.getString("name"), 
						rs.getString("id"), 
						rs.getInt("grade"), 
						rs.getString("jumin"), 
						
						//timestamp -> LocalDateTime -> String
						ConvertDateUtil.convertLocalDateTimeToString(ConvertDateUtil.convertTimestampToLocalDataTime(rs.getTimestamp("birthday"))),
//						rs.getString("birthday"), 
						rs.getString("tel"), 
						rs.getInt("height"), 
						rs.getInt("weight"), 
						rs.getInt("deptno1"), 
						rs.getInt("deptno2"), 
						rs.getInt("profno") 
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}
	
}
