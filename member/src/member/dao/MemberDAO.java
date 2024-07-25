package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import member.bean.MemberDTO;



// Data(Base) Access Object
public class MemberDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	
	private PreparedStatement pstmt;
	
	private ResultSet rs;  // select
	
	
	public MemberDAO() {
		try {
			Class.forName(driver);
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	// 싱글톤 
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance == null) {
			synchronized (MemberDAO.class) {  //synchronized : 한명만 들어오게
				instance = new MemberDAO();
			}
		}
		return instance;
	}
	
	
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
			//System.out.println("connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	public int write(MemberDTO memberDTO) {
		int su=0;
		
		getConnection();
		String sql = "INSERT INTO MEMBER VAlUES (?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setNString(1, memberDTO.getName());
			pstmt.setNString(2, memberDTO.getId());
			pstmt.setNString(3, memberDTO.getPwd());
			pstmt.setNString(4, memberDTO.getPhone());
			
			su = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return su;
	}


	public  boolean isExistID(String id) {	
		boolean exist = false;
		
		getConnection();
		
		String sql = "SELECT * FROM MEMBER WHERE ID LIKE ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();  // T/F
			
			if(rs.next()) exist = true;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return exist;
	} // isExistID



	public String login(String id, String pwd) {
		getConnection();
		
		String sql = "SELECT * FROM MEMBER WHERE ID=? and pwd=?";
		String name = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString("name");				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return name;
	}


//1. HashMap이용해서 받아오기 
//2. DAO를 이용하기 
	public int update(Map<String, String> map) {
		getConnection();
		
		int su=0;
		
		String sql = "UPDATE member SET name=?, pwd=?, phone=? WHERE id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, map.get("name"));
			pstmt.setString(2, map.get("pwd"));
			pstmt.setString(3, map.get("phone"));
			pstmt.setString(4, map.get("id"));
			
			su = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return su;
	}



	public MemberDTO getMember(String id) {
		getConnection();
		MemberDTO memberDTO = null;
		
		String sql = "select * from member where id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();  // select만 executeQuery()
			
			if(rs.next()) {
				memberDTO = new MemberDTO();
				memberDTO.setId(rs.getString("id"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPwd(rs.getString("pwd"));
				memberDTO.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return memberDTO;
	}



	public int delete(String id) {
		getConnection();
		
		int su=0;
		String sql = "delete from member where id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			su = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return su;
	}



	
	
	
}


