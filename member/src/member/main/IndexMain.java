package member.main;

import java.util.Scanner;

import member.service.DeleteService;
import member.service.LoginService;
import member.service.Member;
import member.service.UpdateService;
import member.service.WriteService;

// 시작점
public class IndexMain {
	

	public void menu() {  // 나중에 HTML로 갈 부분이 될것입니다.
		Scanner scan = new Scanner(System.in);
		Member member = null;
		
		while(true) {

			System.out.println();
			System.out.println("**************************************");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 끝");
			System.out.println("**************************************");
			System.out.println();
			System.out.print("번호 입력 : ");
			int num = scan.nextInt();
			
			
			if(num == 5) break;
			else if(num ==1) {
				System.out.println(">>>회원가입<<<");
				member = new WriteService();
			} else if(num == 2) {
				System.out.println(">>>로그인<<<");
				member = new LoginService();
			} else if(num == 3) {
				System.out.println(">>>회원정보수정<<<");
				member = new UpdateService();
			} else if(num == 4) {
				System.out.println(">>>회원탈퇴<<<");
				member = new DeleteService();
			}
			member.excute();
			
			
		}
	} // menu()
	
	public static void main(String[] args) {
		IndexMain indexMain = new IndexMain();
		indexMain.menu();
		System.out.println("프로그램을 종료합니다.");
	}

}
