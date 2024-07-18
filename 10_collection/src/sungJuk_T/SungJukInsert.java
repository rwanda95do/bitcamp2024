package sungJuk_T;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
        int no = scan.nextInt();
        System.out.print("이름 입력 : ");
        String name = scan.next();
        System.out.print("국어 입력 : ");
        int kor = scan.nextInt();
        System.out.print("영어 입력 : ");
        int eng = scan.nextInt();
        System.out.print("수학 입력 : ");
        int math = scan.nextInt();
        
        SungJukDTO sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
        sungJukDTO.calc(); //총점, 평균 계산
        
        list.add(sungJukDTO);
        
        System.out.println("입력되었습니다");
		
	}

}








