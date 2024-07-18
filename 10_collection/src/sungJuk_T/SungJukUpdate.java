package sungJuk_T;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int no = scan.nextInt();
		
		boolean sw = false;
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getNo() == no) {
				sw = true;
				
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO);
				System.out.println();
				
				System.out.print("수정 할 이름 입력 : ");
				String name = scan.next();
				System.out.print("수정 할 국어 입력 : ");
				int kor = scan.nextInt();
				System.out.print("수정 할 영어 입력 : ");
				int eng = scan.nextInt();
				System.out.print("수정 할 수학 입력 : ");
				int math = scan.nextInt();
				
				//수정
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				
				break; //번호는 똑같이 없다.
			}//if
			
		}//for
		
		if(!sw) System.out.println("잘못된 번호 입니다.");

	}

}








