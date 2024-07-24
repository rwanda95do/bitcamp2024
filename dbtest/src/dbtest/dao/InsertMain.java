package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// lombok.jar
// ojdbc8.jar
public class InsertMain {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	
	private PreparedStatement pstmt;  // PreparedStatement(인터페이스 입니다)
	
	public InsertMain() {
	// oracle.jdbc.driver.OracleDriver.class 파일이 클래스인이 인터페이스인지 모르기때문에
		// Class 타입으로 만들어준다.  (class랑 다름)
		try {
			Class.forName(driver);
			//Class.forName("oracle.jdbc.driver.OracleDriver"); // 생성
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			// 파일명이 틀리면 파일을 못 찾았다고 ERROR
			e.printStackTrace();
		}  
	} 
	
	// Connectoin : java.sql interface
	// 생성자 안에서 해버리면 한번밖에 접속못함..ㅋㅋ  -> 함수를 만듭시다
	public void getConnection() {
		// implements해버리면.. 엄청 많은 메소드를 오버로드해야함.. 미친거죠
		// 대신 할 녀석을 찾아라! "See Also" 부분을 보아라.연결메소드를 알려주리라 
		//DriverManager.getConnection("jdbc:oracle:드라이버명:@서버:포트번호:데이터베이스명", "c##java", "1234");
		//Connecton con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##java", "1234"); // 대소문자 상관 없음
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertArticle() {
	
	// 데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.print("키: ");
		double height = scan.nextDouble();
		
	// 내가 원할때 불르고 끊어 버리겠어!! 그래서 따로 함수를 만들어 버립시다
		this.getConnection();  
		
	// SQL
		try {
		// pstmt = con.prepareStatement("SQL문");
			pstmt = con.prepareStatement("insert into dbtest values(?, ?, ?, sysdate)");   // Connection의 메소드를 사용해서 생성
		// 보안을 위해서 ?를 사용합니다.
		// ? 에 데이터를 매핑  -> oracle은 1번 부터 시작! 
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			int su = pstmt.executeUpdate(); // 실행 : 개수 리턴

			System.out.println(su + "개의 행이 삽입되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 생성이 안됬으면 닫을 필요가 없으니까 if를 사용해서 물어봐주었음.
				if(pstmt != null) pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new InsertMain().insertArticle();

	}

}
