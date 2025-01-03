package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz11 {

	public static void main(String[] args) {

//		Professor prof = findProfessorListByDeptno(101);
//		if(prof != null) {
//			System.out.printf("%d, %s, %d, %s, %d, %d",
//					prof.getProfno(), prof.getName(), prof.getId(),
//					prof.getPosition(), prof.getPay(), prof.getDeptno());
//		}
		
		List<Professor> pList = findProfessorListByDeptno(101);
		if(pList != null && pList.size() > 0) {
			for(Professor prof : pList) {
				System.out.printf("%d, %s, %s, %s, %d, %d\n",
						prof.getProfno(), prof.getName(), prof.getId(),
						prof.getPosition(), prof.getPay(), prof.getDeptno());
//				prof.toString();
			}
		}
		
	}
	
public static List<Professor> findProfessorListByDeptno(int deptno) {
		
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
		
		List<Professor> profList = new ArrayList<Professor>();
		
		String sqlQuery = "select * from professor where deptno = ?";
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Professor professor = new Professor();
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
				professor.setDeptno(rs.getInt("deptno"));
				
//				Professor prof = new Professor(rs.getInt("profno"), rs.getString("name"), rs.getInt("id"),
//						rs.getString("position"), rs.getInt("pay"), rs.getInt("deptno"));
				
				profList.add(professor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
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
		
		return profList;
	}

}

class Professor {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	int deptno;
	
	public Professor() {
	}
	
	public Professor(int profno, String name, String id, String position, int pay, int deptno) {
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.position = position;
		this.pay = pay;
		this.deptno = deptno;
	}
	
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}
	
	
}