package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 :");
		int no = scan.nextInt();
		int ck=0;
		
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getNo() != no) {ck ++;}
				
			else {		
				System.out.println(sungJukDTO);
				
				System.out.print("수정 할 이름 입력");
				sungJukDTO.setName(scan.next());
				System.out.print("수정 할 국어 입력");
				sungJukDTO.setKor(scan.nextInt());
				System.out.print("수정 할 영어 입력");
				sungJukDTO.setEng(scan.nextInt());
				System.out.print("수정 할 수학 입력");
				sungJukDTO.setMath(scan.nextInt());
				
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;
			}
		}// for
		
		if(ck == list.size()) {
			System.out.println("번호가 잘못 입력되었습니다");
		}
		
	} // excute()
	
	

}
