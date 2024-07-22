package book;

import java.util.ArrayList;
import java.util.Scanner;



// 책 제목으로 검색
public class BookTitleSearch implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 책 제목 : ");
		String serchTitle = scan.next();
		serchTitle = serchTitle.toLowerCase();
		
		// 한글인거랑 영어인거랑 구분하나?
		for(BookDTO bookDTO: list) {
			// 대소문자 구분 없이 모두 출력
			String booktitle = bookDTO.getTitle().toLowerCase();
			if(serchTitle.equals(booktitle)) {
				System.out.println(bookDTO);
			}

			
			// 한 글자라도 포함하고 있으면 출력
			else if(booktitle.indexOf(serchTitle)==0) {
				System.out.println(bookDTO);
			}
			
			
		}
		
	}

}
