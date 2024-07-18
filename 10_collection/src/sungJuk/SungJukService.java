package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	// Service에 ArrayList<SungJukDTO> list를 생성하는 이유는 
		// => 지역으로 만들면 안되는 이유
		// 예) SungJukInsert 클래스에서 만들어버리면, SungJukInsert클래스가 끝나는 순간  
		//     ArrayList<SungJukDTO>로 만든 SungJukDTO가 같이 사라져 버린다...   
		// 그래서 SungJukService클래스으 에서 만들어서 sungJuk.execute(list)로 주소를 넘겨줘서 이용하게 한다.
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num =  0;
		SungJuk sungJuk = null; // 다형성 이용하기 : 부모는 new를 할 필요가 없다. 
		
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
			if(num == 1) { // 다형성을 이용하기  부모 xxx = new 자식
				sungJuk = new SungJukInsert();  // SungJukInsert sungJukInsert = new SungJukInsert(); -> 1:1
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
				continue;  // while 문으로 다시 돌아간다 
							// 없으면, sungJuk.execute(list); 요게 실행되는데, 
							// list에 들어있는게 없어서 NullPointException발생 
			} 
			
			sungJuk.execute(list); 
			
			
			
		} // while
		
		
	} // menu()
}
