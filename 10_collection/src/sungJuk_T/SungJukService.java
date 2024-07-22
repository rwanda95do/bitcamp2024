package sungJuk_T;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		SungJuk sungJuk = null;
		
		while(true) {
			System.out.println();
			System.out.println("-------------");
            System.out.println("  1. 등록");
            System.out.println("  2. 출력");
            System.out.println("  3. 파일 저장");
            System.out.println("  4. 파일 읽기");
            System.out.println("  5. 책 제목으로 오름차순");
            System.out.println("  6. 책 제목으로 검색");
            System.out.println("  7. 끝");
            System.out.println("-------------");
            
            System.out.print("번호 선택 : ");
            num = scan.nextInt();
            
            if(num==6) break;
            else if(num==1) {
            	sungJuk = new SungJukInsert();
            	//System.out.println(list);
            }
            else if(num==2) {
            	sungJuk = new SungJukPrint();
            }
            else if(num==3) 
            	sungJuk = new SungJukUpdate();
            else if(num==4)
            	sungJuk = new SungJukDelete();
            else if(num==5)
            	sungJuk = new SungJukSort();
            else { 
            	System.out.println("1 ~ 6번 중에 선택하세요");
            	continue;
            }
            
            sungJuk.execute(list);

		}//while
		
	}//menu()

}







