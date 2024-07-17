package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		SungJuk sungJuk = null; // 부모는 new를 할 필요가 없다. 
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("\t 1.입력 ");
			System.out.println("\t 2.출력 ");
			System.out.println("\t 3.수정 ");
			System.out.println("\t 4.삭제 ");
			System.out.println("\t 5.정렬 ");
			System.out.println("\t 6.끝 ");
			System.out.println("***********************");
			
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			if(num == 6) {break;}
			if(num == 1) {
				sungJuk = new SungJukInsert();
			} else if(num ==2) {
				sungJuk = new SungJukPrint();
			} else if(num ==3) {
				sungJuk = new SungJukUpdate();
			} else if(num ==4) {
				sungJuk = new SungJukDelete();
			} else if(num ==5) {
				sungJuk = new SungJukSort();
			} else {
				System.out.println("1~6중에 선택하세요");
			} 
			
			sungJuk.execute(list);
			
			
			
		} // while
		
		
	} // menu()
}
