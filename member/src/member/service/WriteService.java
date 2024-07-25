package member.service;

import java.util.Scanner;

import member.bean.MemberDTO;
import member.dao.MemberDAO;



public class WriteService implements Member{
	
	
	@Override
	public void excute() {
		Scanner scan = new Scanner(System.in);
		MemberDAO memberDAO = MemberDAO.getInstance();;  // DB연결
		
		System.out.println();
		System.out.print("이름 입력 : ");
		String name = scan.next();
	// 중복체크(아이디)
		String id;
		while(true) {
			System.out.print("아이디 입력 : ");
			id = scan.next();
			
			boolean exist = memberDAO.isExistID(id);
			
			// DB에 있는지 검색해보고 있으면 중복됬다고 알려라! 
			if(exist) {
				System.out.println("사용중인 아이디 입니다.");
			} else {
				System.out.println("사용가능한 아이디 입니다.");
				break;
			}			
		} // while
		
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		System.out.print("핸드폰 입력 (010-1234-5678) : ");
		String phone = scan.next();
		
		MemberDTO memberDTO = new MemberDTO(name, id, pwd, phone);
		
		// DB-싱글톤
		//MemberDAO memberDAO = new MemberDAO();  // new하면 죽어버림 -> 싱글톤으로 만들어줘야함.. 
		int su = memberDAO.write(memberDTO);
		System.out.println(su + "개의 행이 입력되었습니다");
		//System.out.println("회원가입 완료");
		
	}



}
