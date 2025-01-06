package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArplDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public int saveArplInfo(ArplInfo arplInfo) {
		
		conn = DBConnectionManager.connectDB();
		
		int result = 0;
		
//		SELECT NVL(MAX(arplno), 0)+1
//		FROM arplinfo
		
		//쿼리 준비
//		String sqlQuery = "insert into ARPLINFO values ( (SELECT NVL(MAX(arplno), 0)+1 "
//				+ "FROM arplinfo), ?, ?, ?, ?, ?, ?) ";
		
		String sqlQuery = "insert into ARPLINFO values ( arplinfo_pk_seq.nextval, ?, ?, ?, ?, ?, ?) ";
		try {
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅
			psmt.setString(1, arplInfo.getInformCode());
			psmt.setString(2, arplInfo.getActionKnack());
			psmt.setString(3, arplInfo.getInformCause());
			psmt.setString(4, arplInfo.getInformData());
			psmt.setString(5, arplInfo.getInformGrade());
			psmt.setString(6, arplInfo.getImageUrl());
			
			//select -> executeQuery
			//insert, update, delete -> executeUpdate 
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
	
}
