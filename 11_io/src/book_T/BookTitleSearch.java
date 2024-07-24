package book_T;

import java.util.List;
import java.util.Scanner;



// 책 제목으로 검색
public class BookTitleSearch implements Book{

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 책 제목 : ");
		String title = scan.next().toLowerCase();
		
		int sw = 0;
		for(BookDTO bookDTO: list) {
		// 한글자라도 포함하고 있으면 검색 
			// contains() : 포함하는거 다 가져와라   => SQL : like '%j%'
			if(bookDTO.getTitle().toLowerCase().contains(title)) {
				System.out.println(bookDTO);
				sw=1;
			}
		if(sw==0) {
			System.out.println("검색한 책이 없습니다.");
		}
			
		}
		
	}

}
