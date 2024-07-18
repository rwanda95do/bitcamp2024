package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk{

	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();


	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		ArrayList<SungJukDTO> copyList = (ArrayList<SungJukDTO>) list.clone();

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("\t 1.총점으로 내림차순 ");
			System.out.println("\t 2.이름으로 오름차순 ");
			System.out.println("\t 3.이전 메뉴 ");
			System.out.println("***********************");
			
			System.out.print("번호입력 : ");
			num= scan.nextInt();
			
			if(num == 3) break;
			if(num == 1) {
				//Collections.sort(list);  
				// 원본 기억 메소드 : ArrayList clone()
				Collections.sort(copyList);   // 원본을 바꿔버리는 SORT -> 원본을 기억하게 만들어도 좋다
			}else if (num ==2) {;
				// 중첩 클래스를 이용해야 가능
				Comparator<SungJukDTO> comparator = new Comparator<SungJukDTO>() {
					
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						
						return s1.getName().compareTo(s2.getName()) ;
					}
				};
				Collections.sort(copyList, comparator);
				
			}
			
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
			for(SungJukDTO sungJukDTO : copyList) {
				System.out.println(sungJukDTO.toString());  // 오버라이딩해놔서 주소로 나오지 않음.
			}
			
			
			
		} // while
		
	} // excute

}
