package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	
	private Connection con;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";//"jdbc:oracle:드라이버명:@서버:포트번호:데이터베이스명";
	private String username = "c##java";
	private String password = "1234";
	
	private PreparedStatement pstmt;
	
// 1.생성자 드라이버 만들기 => 한번만 접속하기 위해서 사용
	public UpdateMain() {
	// 필요 재료 : "oracle.jdbc.driver.OracleDriver"
		// 재료가 클래스/인터페이스인지 모르기 때문에 Class타입으로 만든다.
		try {
			Class.forName(driver);
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
// 2.접속 => Connection
	// 생성자에서 하지 않고 따로 함수를 만드는 이유는? 생성자안에서 하면 한번밖에 만들지 못하니, 또 필요할 때 사용할 수가 없다
	public void getConnection() {
		try {
		// Connection은 인터페이스. 생성방법 중 메소드를 이용하기
			// 필요 재료 : Connecton 변수명 = DriverManager.getConnection("jdbc:oracle:드라이버명:@서버:포트번호:데이터베이스명", "c##java", "1234");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

// 3.수정 메소드 => updateArticle()
	public void updateArticle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 이름 입력 : ");
		String name = scan.next();

		getConnection();
		
		
		try {
		// 필요 재료 : PreparedStatement 변수명 = con.prepareStatement("SQL문");
			pstmt = con.prepareStatement("UPDATE DBTEST SET AGE = AGE + 1 WHERE NAME LIKE ?");
			pstmt.setString(1, "%" + name + "%");
			// 실행 : pstmt.executeUpdate();
			int su = pstmt.executeUpdate();
			System.out.println(su + "개 행이 업데이트되었습니다.");
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
	
	public static void main(String[] args) {
		// 1.생성자 드라이버 만들기 => 한번만 접속하기 위해서 사용
		// 2.접속 => Connection
		new UpdateMain().updateArticle();

		// 3.수정 메소드 => updateArticle()
		
	}

}
