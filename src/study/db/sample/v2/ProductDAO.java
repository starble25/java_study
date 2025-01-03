package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public List<Product> findProductList() {
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = "select * from product";
		List<Product> productList = new ArrayList<Product>();
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				productList.add(new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return productList;
	}
	
}
