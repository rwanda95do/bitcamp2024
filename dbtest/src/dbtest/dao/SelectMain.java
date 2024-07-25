package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
//----------------------------------------------
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	
	private PreparedStatement pstmt;
	
	// select문의 결과를 가져오기 위한 ResultSet(인터페이스)
	private ResultSet rs;
	
// ---------------------------------------------	
	
	public SelectMain() {
		try {
			Class.forName(driver);
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  
	}
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
// ----------------------------------------------
	
	public void selectArticle() {
		getConnection(); 
		
		String sql = "SELECT * FROM DBTEST";
		try {
			pstmt = con.prepareStatement(sql);
			//실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t"
									+ rs.getInt("age") + "\t"
									+ rs.getDouble("height") + "\t"
									+ rs.getDate("logtime"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(con !=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new SelectMain().selectArticle();
	}

}
