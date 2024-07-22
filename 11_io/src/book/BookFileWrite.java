package book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


// 파일 저장
public class BookFileWrite implements Book{


	
	@Override
	public void execute(ArrayList<BookDTO> list) {
		
		for(BookDTO bookDTO: list) {
			System.out.println(bookDTO);
		}
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
		
		//리스트로 저장하면 어떻게 꺼내는건데 ㅠㅠㅠㅠㅠ
			//oos.writeObject(list);
			
			
		// 왜 DTO하면 안해주는건데!! 
		// 왜 하나만 저장해주는건데!!!!!
			for(BookDTO bookDTO : list) {
				System.out.println(bookDTO);
				oos.writeObject(bookDTO);	

			}
			
			
			oos.close();	
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // excute()

}
