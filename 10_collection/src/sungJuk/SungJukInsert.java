package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		SungJukDTO sungJukDTO = new SungJukDTO();
		
		System.out.print("번호 입력 : ");
		sungJukDTO.setNo(scan.nextInt());
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		
		sungJukDTO.calc();
		
		list.add(sungJukDTO);
		
		System.out.println("입력되었습니다.");
		
	}

}
