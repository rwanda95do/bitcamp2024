package book_T;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;


// 책 제목으로 오름차순 : 정렬 기준이 하나임 
public class BookTitleAsc implements Book{

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		// 1.Comparable<T> 사용
	// 2.Comparator<T> 사용
		Comparator<BookDTO> com = new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO b1, BookDTO b2) {
				return b1.getTitle().compareTo(b2.getTitle());  // 오름차순
			}
		};
		
		Collections.sort(list, com);
		
		// 원본이 파일 안에 저장되어 있기 때문에 굳이 복사할 필요가 없구나!
		System.out.println();
		System.out.println("코드\t 책제목\t 저자\t 단가\t 개수\t 합계");

		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
	}
}
