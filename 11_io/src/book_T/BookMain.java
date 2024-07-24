package book_T;

public class BookMain {
	
	public static void main(String[] args) {
		BookService bookService = new BookService();
		
		bookService.menu();
		System.out.println("프로그램을 종료합니다");
	}
}
