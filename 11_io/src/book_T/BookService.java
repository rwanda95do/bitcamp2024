package book_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookService {

	private List<BookDTO> list = new ArrayList<>();  // 다형성 : 부모 = 자식 
														// 부모는 인터페이스로 잡아서 자식이 전부 생성해버리게하기 -> 스프링에서 많이 사용함
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		Book book = null; 
	
		while(true) {		
			System.out.println();
			System.out.println("-------------");
			System.out.println("  1. 등록");
			System.out.println("  2. 출력");
			System.out.println("  3. 파일 저장");
			System.out.println("  4. 파일 읽기");
			System.out.println("  5. 책 제목으로 오름차순");
			System.out.println("  6. 책 제목 검색");
			System.out.println("  7. 끝");
			System.out.println("-------------");
			System.out.println();
			
			System.out.print("번호를 입력하세요 : ");
			num = scan.nextInt();
			
			
			//BookInsert bookinsert = new BookInsert()  -> 1대1 
			if(num==7) break;
			else if(num==1) {
				book = new BookInsert();	// 다형성 : 부모 = 자식
			}
			else if(num==2) {
				book = new BookPrint();
			}
			else if(num==3) 
				book = new BookFileWrite();
			else if(num==4)
				book = new BookFileRead();
			else if(num==5)
				book = new BookTitleAsc();
			else if(num==6)
				book = new BookTitleSearch();
			else { 
				System.out.println("1 ~ 7번 중에 선택하세요");
				continue;
			}
			book.execute(list);
		} // WHILE
        
        
	} //menu()

}
