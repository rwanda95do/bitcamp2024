package member.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class UpdateService implements Member {

	@Override
	public void excute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = scan.next();
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getMember(id);
		
		if(memberDTO == null) {			
			System.out.println("검색한 아이디가 없습니다.");
			return; // 함수종료
		}else {
			memberDTO.toString();
			System.out.print("수정 할 이름 입력 :");
			String name = scan.next();
			System.out.print("수정 할 비밀번호 입력 :");
			String pwd = scan.next();
			System.out.print("수정 할 핸드폰번호 입력 :");
			String phone = scan.next();
			
			Map<String, String> map = new HashMap<>();
			map.put("name", name);
			map.put("id", id);
			map.put("pwd", pwd);
			map.put("phone", phone);
			
			int su = memberDAO.update(map);
			
			System.out.println(su + "개의 행을 수정하였습니다.");
			
		}
		
	}

}
