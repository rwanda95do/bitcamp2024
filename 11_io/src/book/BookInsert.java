package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 : 코드 책제목 저자 단가 개수"); 
		
		// 공백 때문에 read써야하는건가.... 
		int code = scan.nextInt();
		String title = scan.next();
		String author = scan.next();
		int price = scan.nextInt();
		int qty = scan.nextInt();
		
		BookDTO bookDTO = new BookDTO(code, title, author, price, qty);
		
		list.add(bookDTO);
		
		
	}

	
}
