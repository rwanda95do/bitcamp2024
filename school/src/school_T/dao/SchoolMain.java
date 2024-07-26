package school_T.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


// 싱글톤 없이
public class SchoolMain {
// main **************************************************
	public static void main(String[] args) {
		SchoolMain schoolMain = new SchoolMain();
		schoolMain.menu();
	}
// ******************************************************8
// ===DB연결===============================================	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	// 1. 생성자
	public SchoolMain() {
		try {
			Class.forName(driver);
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 2. 연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
// -----------------------------------------
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		while(true){
			System.out.println();
			System.out.println("*****************************");
			System.out.println("             관리             ");
			System.out.println("*****************************");
			System.out.println("           1. 입력");
			System.out.println("           2. 검색");
			System.out.println("           3. 삭제");
			System.out.println("           4. 종료");
			System.out.println("*****************************");

			System.out.print("  번호 선택 :    ");
			num = scan.nextInt();
			
			if(num ==4) {
				System.out.println("  프로그램을 종료합니다.");
				break;
			}else if(num == 1)insertArticle();
			else if(num == 2) selectArticle();
			else if(num == 3) deleteArticle();
			else {
				System.out.println("  다시 입력하세요^^");
				continue;
			}
		} // while
	}
	private void deleteArticle() {
		Scanner scan = new Scanner(System.in);
		String name = null;
		
		System.out.println("삭제를 원하는 이름 입력 : ");
		name = scan.next();
		
	// DB
		getConnection();
		String sql="delete * from school where name = ?"; // 삭제할땐 like쓰지 않기
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			int su = pstmt.executeUpdate();
			
			System.out.println(su + "개의 행이 삭제되었습니다.");
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
	} // deleteArticle
	
	
	private void selectArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**검색************************");
			System.out.println("*****************************");
			System.out.println("           1. 이름 검색");
			System.out.println("           2. 전체 검색");
			System.out.println("           3. 이전 메뉴");
			System.out.println("*****************************");
			
			System.out.print("  번호 선택 :  ");
			num = scan.nextInt();
			
			String name = null;
			
			if(num==3) break;
			else if(num ==1) {
				System.out.print("  검색할 이름 입력 : ");
				name = scan.next();
			}else if(num == 2) {
				
			}
			
		// DB
			getConnection();
			String sql = null;
			if(num ==1) 
				sql = "select * from school where name like ?";
			else if(num ==2)
				sql = "select * from school";
			
			try {
				pstmt = con.prepareStatement(sql);
				if(num==1)
					pstmt.setString(1, "%" + name + "%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print("이름 : " + rs.getString("name"));
					if(rs.getInt("code")==1) // 학번
						System.out.println("학번 : " + rs.getString("value"));
					else if(rs.getInt("code")==2) // 과목
						System.out.println("과목 : " + rs.getString("value"));
					else if(rs.getInt("code")==3) // 부서
						System.out.println("부서 : " + rs.getString("value"));
				} // while
					
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
		} // while
		
	} // deleteArticle
	
	
	private void insertArticle() {
		Scanner scan = new Scanner(System.in);
		int code;
		
		while(true) {
			System.out.println();
			System.out.println("**입력************************");
			System.out.println("*****************************");
			System.out.println("           1. 학생");
			System.out.println("           2. 교수");
			System.out.println("           3. 관리자");
			System.out.println("           4. 이전메뉴");
			System.out.println("*****************************");
			
			System.out.print("  번호 선택 :  ");
			code = scan.nextInt();
			
			String name = null;
			String value= null;
			
			System.out.print("  이름 입력 : ");
			name = scan.next();
			
			if(code == 4)  break; // break로 해서 함수를 나가야지 메모리를 계속 잡아먹지 않을 수 있다. 
			else if(code == 1) {
				System.out.print("  학변 입력 : ");
				value = scan.next();
			} else if(code == 2) {
				System.out.print("  과목 입력 : ");
				value = scan.next();
			} else if(code == 3) {
				System.out.print("  부서 입력 : ");
				value = scan.next();
			} else continue;
			
		// DB
			getConnection();
			String sql = "insert into school values(?, ?, ?)";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);
				
				int su = pstmt.executeUpdate();
				System.out.println(su + "개의 행이 삽입되었습니다.");
				
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
		} // while
		
	} // insertArticle
}
