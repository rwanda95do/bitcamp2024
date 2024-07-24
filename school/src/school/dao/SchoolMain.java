package school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolMain {
	Scanner scanner = new Scanner(System.in);
	
// ===DB연결===============================================	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private Connection con;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	PreparedStatement pstmt;
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
	// 3. 메소드에서 SQL 작성 
// ===================================================
	
// --------------------------------------------------	
	public void menu() {
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
			int num = scanner.nextInt();
			
			
			if(num ==4) {
				System.out.println("  프로그램을 종료합니다.");
				break;
			} else if(num == 1) {
				insertArticle();
				break;
			} else if(num == 2) {
				selectArticle();
				break;				
			} else if(num == 3) {
				deleteArticle();
				break;
			} else {
				System.out.println("  다시 입력하세요^^");
				continue;
			}
			
			
		} // WHILE
	}// METHOD : menu()
	
// ----------------------------------------------	
	public void insertArticle() {
		getConnection();
		
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
			int code = scanner.nextInt();
			
			String name;
			String value;
			
			if(code == 1) {
				System.out.println("**학생************************");
				System.out.print("  이름 입력 : ");
				name = scanner.next();
				System.out.print("  학변 입력 : ");
				value = scanner.next();
			} else if(code == 2) {
				System.out.println("**교수************************");
				System.out.print("  이름 입력 : ");
				name = scanner.next();
				System.out.print("  과목 입력 : ");
				value = scanner.next();
			} else if(code == 3) {
				System.out.println("**관리자************************");
				System.out.print("  이름 입력 : ");
				name = scanner.next();
				System.out.print("  부서 입력 : ");
				value = scanner.next();
			} else if(code == 4) {
				break;
			} else {
				System.out.println("  다시 입력하세요^^");
				continue;
			}
			
			// SQL
			try {
				pstmt = con.prepareStatement("INSERT INTO SCHOOL VALUES (?, ?, ?)");
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
			
		} // WHILE
	} // METHOD : insertArticle()
// -----------------------------------------------	

	public void selectArticle() {
		getConnection();
		
		while(true) {
			System.out.println();
			System.out.println("**검색************************");
			System.out.println("*****************************");
			System.out.println("           1. 이름 검색");
			System.out.println("           2. 전체 검색");
			System.out.println("           3. 이전 메뉴");
			System.out.println("*****************************");
			
			System.out.print("  번호 선택 :  ");
			int num = scanner.nextInt();
			
			String name;
			String value;
			if(num == 1 ) {
				System.out.println("**이름 검색************************");
				System.out.print("  검색할 이름 입력 : ");
				name = scanner.next();
			} else if(num == 2) {
				System.out.println("**전체 검색************************");
			} else if(num == 3 ) {
				break;
			} else {
				System.out.println("  다시 입력하세요^^");
				continue;
			}
		} // WHILE
	} // METHOD: selectArticle()
	
// -----------------------------------------------

	public void deleteArticle() {
		getConnection();
		
		System.out.println();
		System.out.println("**삭제************************");
		System.out.println("*****************************");
		
		System.out.println("삭제를 원하는 이름 입력 : ");
		String name = scanner.next();
		
		// SQL
		try {
			pstmt = con.prepareStatement("DELETE FROM SCHOOL WHERE NAME LIKE ?");
			pstmt.setString(1, name);
			
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
	}
	
// -----------------------------------------------	
	public static void main(String[] args) {
		new SchoolMain().menu();
		
		
	}
	
}
