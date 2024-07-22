package book;

import java.util.ArrayList;

public class BookPrint implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		
		System.out.println("코드\t 책제목\t 저자\t 단가\t 개수\t 합계");
		
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
	} // execute()

}
