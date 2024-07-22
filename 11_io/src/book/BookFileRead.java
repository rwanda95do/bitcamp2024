package book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


// 파일 읽어오기
public class BookFileRead implements Book{
	
	@Override
	public void execute(ArrayList<BookDTO> list) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
			
			//BookDTO bto=(BookDTO) ois.readObject();
			//ois.readObject();
			
			
			// 어떻게 읽어오냐고!!!! 
			System.out.println(ois.readObject());
	
			//ois.readObject() : ArrayList
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}  // excute()
	
}
