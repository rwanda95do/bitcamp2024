package member.service;

import java.util.Scanner;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class DeleteService implements Member {

	@Override
	public void excute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getMember(id);
		
		int su=0;
		if(memberDTO.getPwd().equals(pwd)) {
			su = memberDAO.delete(id);
			System.out.println(su + "개의 행을 삭제하였습니다.");
		} else {
			System.out.println("비밀번호를 틀렸습니다.");
			return;
		}
		
		/*
		 * 아이디 입력
		 * 비밀번호 입력
		 * 비밀번호가 맞지 않으면 삭제 불가능
		 * 
		 * 비밀번호가 맞으면 삭제
		 * */

	}

}
