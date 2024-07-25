package member.service;

import java.util.Scanner;

import member.dao.MemberDAO;

public class LoginService implements Member{

	@Override
	public void excute() {
		System.out.println();

		Scanner scan = new Scanner(System.in);
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = scan.next();
			System.out.print("비밀번호 입력 : ");
			String pwd = scan.next();
		
			String name = memberDAO.login(id, pwd);
			
			if(name == null) {
				System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
			} else {
				System.out.println(name + "님 로그인");
				break;
			}
		}
	}


}
