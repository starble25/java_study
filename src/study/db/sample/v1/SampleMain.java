package study.db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {
//		selectDept();
//		findProduct();
		
//		findDeptByDeptno(40);
//		findDeptByDeptno(20);
		
//		findDeptByDname("SALES");
//		findDeptByDname("RESEARCH");
		
		Dept d1 = findDeptByDeptno(30);
		
		// 메소드에서 null로 초기화 : int type은 0으로 비교하면 조회를 못한건지 data가 0이 온건지 구분이 안됨  
		if(d1 != null) {
			System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
		}
		
		List<Dept> dList = findDeptList();
		if(dList != null && dList.size() > 0) { //Data 있다
			for(Dept d : dList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}
		}
	}
	
	public static void findProduct() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = "select * from product";
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//				   readDept 	findDept	findDeptList
	public static void selectDept() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; // db 연결
		//Statement stmt = null;	// 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null;	// sql 실행 select 결과 저장하는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//쿼리 준비
//		String sqlQuery = "select * from dept";
		String sqlQuery = "select * from dept where deptno = 30";
		try {
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			if(rs.next()) { //다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}
			
			/*
			while(rs.next()) { //다음 읽어올 데이터가 있는가? true 데이터가 있다
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}
			*/
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Dept findDeptByDeptno(int deptno) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; // db 연결
		PreparedStatement psmt = null;
		ResultSet rs = null;	// sql 실행 select 결과 저장하는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Dept dept = null;
		
		//쿼리 준비
		String sqlQuery = "select * from dept where deptno = ?";
		try {
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
//			Dept dept = new Dept();
			
			if(rs.next()) { //다음 읽어올 데이터가 있는가? true 데이터가 있다
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getString("loc"));
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				
				return dept;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // try/catch에서 return해도 finally 실행됨
			//DB 연결 종료
//			try {
//				if(rs != null)
//					rs.close();
//				if(psmt != null)
//					psmt.close();
//				if(conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
		
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void findDeptByDname(String dname) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; // db 연결
		PreparedStatement psmt = null;
		ResultSet rs = null;	// sql 실행 select 결과 저장하는 객체
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//쿼리 준비
		String sqlQuery = "select * from dept where dname = ?";
		try {
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery();
			if(rs.next()) { //다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static List<Dept> findDeptList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();
		
		//쿼리 준비
		String sqlQuery = "select * from product";
		try {
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			while(rs.next()) { //다음 읽어올 데이터가 있는가? true 데이터가 있다
//				if(deptList == null)
//					deptList = new ArrayList<Dept>();
				
				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}
}

