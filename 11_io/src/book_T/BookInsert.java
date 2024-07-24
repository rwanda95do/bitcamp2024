package book_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInsert implements Book{

	@Override
	public void execute(List<BookDTO> list) {
		Scanner scan = new Scanner(System.in); 
		
		// nextLine() ??? 
		System.out.print("코드 입력 : ");
		String code = scan.next();
		System.out.print("제목 입력 : ");
		String title = scan.next();
		System.out.print("저자 입력 : ");
		String author = scan.next();
		System.out.print("가격 입력 : ");
		int price = scan.nextInt();
		System.out.print("수량 입력 : ");
		int qty = scan.nextInt();
		int total = price * qty;
		
		
		// 데이터가 사라지기 전에 파일에 저장 -> 그럼 언제든지 꺼낼 수 있자너 
			// 항목의 개수가 많기 때문에 read와 write를 많이해줘해서..미쳐버림.. 
			// 그럼 묶어주면 편하잖아?  -> DTO클래스를 이용한다
		
		// 일다 리스트에 담아두고
		BookDTO bookDTO = new BookDTO(code, title, author, price, qty);
		bookDTO.setTotal(total);
		list.add(bookDTO);
		
		System.out.println("추가했습니다");
		
	}

	
}
