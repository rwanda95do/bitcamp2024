package book_T;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;


// 파일 저장
	// DTO를 저장 >> FOR문을 
	// List를 저장 >> 리스트를 통으로 읽어오면 되서 편함 -> 리스트는 implements Serializable 이미 되어있음

// IO는 객체로 못 넘어간다.그래서 쪼개버려(=직렬화)  -> implements Serializable
public class BookFileWrite implements Book{

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
		
		// 리스트를 파일에 저장
			//oos.writeObject(list);
		
		// 리스트에서 DTO꺼내서 파일에 저장
			for(BookDTO bookDTO : list) {
				System.out.println(bookDTO);
				oos.writeObject(bookDTO);	
			}
			
			oos.close();	
		
			System.out.println("파일에 저장했습니다");
		
		}  catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // excute()

}
