package book_T;

import java.util.ArrayList;
import java.util.List;

// 인터페이스로 만드는 이유
	// 부모는 생성할 필요가 없기때문에?
public interface Book {
	public void execute(List<BookDTO> list);	
	// List로 한 이유는 BookService에서 ArrayList의 부모인 List로 했기 때문에
}
