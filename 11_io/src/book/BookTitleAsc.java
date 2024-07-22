package book;

import java.util.ArrayList;
import java.util.Collections;


// 책 제목으로 오름차순 : 정렬 기준이 하나임 
public class BookTitleAsc implements Book{

	@Override
	public void execute(ArrayList<BookDTO> list) {
		ArrayList<BookDTO> copyList = list;
		
		Collections.sort(copyList);
		
		for(BookDTO bookDTO: copyList) {
			System.out.println(bookDTO);
		}
		
		// 배열 복사해서 하느넉 어떻게 했더라... 
		
		
	}
	

}
