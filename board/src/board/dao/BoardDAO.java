package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import board.bean.BoardDTO;


public class BoardDAO {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 싱글톤 
	private static BoardDAO instance;
	public static BoardDAO getInstance() {
		if(instance == null) {
			synchronized (BoardDAO.class) {  //synchronized : 한명만 들어오게
				instance = new BoardDAO();
			}
		}
		return instance;
	}
// ---------------------------
	
	public BoardDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
// -------------------------------
	
	public void write(BoardDTO boardDTO) {
		getConnection();
		
		String sql = "insert into board_java (seq, id, name, subject, content, logtime) "
				+ "values(board_java_seq.nextval,?,?,?,?,sysdate)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getId());
			pstmt.setString(2, boardDTO.getName());
			pstmt.setString(3, boardDTO.getSubject());
			pstmt.setString(4, boardDTO.getContent());
			
			pstmt.executeUpdate();
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

	} // write
// -------------------------------------------
	
	public void list() {
		getConnection();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		String sql = "select seq, subject, id, logtime from board_java order by seq desc";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("seq") + "\t");
				System.out.print(rs.getString("subject") + "\t");
				System.out.print(rs.getString("id") + "\t");
				System.out.print(rs.getString("logtime") + "\t");
				System.out.println();
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
		
		
		
	}

	public BoardDTO view(int seq) {
		getConnection();
		
		BoardDTO boardDTO = null;
		
		String sql = "select * from board_java where seq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			
			rs = pstmt.executeQuery();
			
			boardDTO = new BoardDTO();
			
			if(rs.next()) {
				boardDTO.setSeq(Integer.parseInt(rs.getString("seq")));
				boardDTO.setId(rs.getString("id"));
				boardDTO.setName(rs.getString("name"));
				boardDTO.setSubject(rs.getString("subject"));
				boardDTO.setContent(rs.getString("content"));
				boardDTO.setLogtime(rs.getString("logtime"));
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
		
		return boardDTO;
	}
	
// --------------------------
}
