package board.main;

import java.util.Scanner;

import board.service.Board;
import board.service.BoardListService;
import board.service.BoardViewService;
import board.service.BoardWriteService;

public class IndexMain {

	public static void main(String[] args) {
		IndexMain indexMain = new IndexMain();
		indexMain.menu();
		
	}
	
// ----------------------------------
	private void menu() {
		Scanner scan = new Scanner(System.in);
		Board board = null;
		
		while(true) {
			int num = 0;

			System.out.println("******************");
			System.out.println("1. 글쓰기");
			System.out.println("2. 목록");
			System.out.println("3. 작성한 글 내용 보기");
			System.out.println("4. 끝");
			System.out.println("******************");
			System.out.println("번호 : ");
			num = scan.nextInt();
			
			if(num == 4) break;
			else if(num == 1) board= new BoardWriteService();//BoardWriteService;
			else if(num == 2) board = new BoardListService();//BoardListService;
			else if(num == 3) board = new BoardViewService(); //BoardViewService
			else continue;
			
			board.execute();
		}
		
		
		
	} // METHOD : menu()

}
