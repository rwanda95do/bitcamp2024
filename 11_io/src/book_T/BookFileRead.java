package book_T;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


// 파일 읽어오기
public class BookFileRead implements Book{

	@Override
	public void execute(List<BookDTO> list) {
		System.out.println();
		
		// 리스트를 비우기 
			// 리스트를 비우고 파일로 읽어오겠어!! -> 안그러면 있던 리스트에 추가로 더 생겨버릴꺼야;; 
		list.clear();
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
			
		// 1. 리스트로 파일에 저장 -> 파일에서 리스트 꺼내기
		/*	
			List<BookDTO> loadList = (List<BookDTO>)ois.readObject();
			for(BookDTO bookDTO : loadList) {
				list.add(bookDTO);
			}
		*/	
		// 2. List에서 DTO꺼내서 파일에 저장 -> 파일에서 DTO 꺼내기 
			// 리스트의 사이즈를 모르니까 파일에 리스트 사이즈도 같이 저장해주거나
		// 사이즈를 저장하지 않았다면 exception이용하기
			while(true) {
				try {
					BookDTO bookDTO =  (BookDTO) ois.readObject();
					list.add(bookDTO);
				} catch(EOFException e ) {
					e.printStackTrace();
					break;
				}
			} // WHILE
			
			System.out.println("파일에서 모든 항목을 로드하였습니다");
			ois.close();
	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// ois.readObject() 에러 발생할 수 있음
			e.printStackTrace();
		}
	
	}  // excute()
	
}
