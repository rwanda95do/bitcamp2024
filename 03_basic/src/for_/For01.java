package for_;

public class For01 {
	public static void main(String[] args) {
		int i; // 지역변수 (쓰레기값을 가지고 있으므로 초기화하기)
		
		for(i=1; i<=5; i++) {
			System.out.println("Hello Kitty  " + i);
		}
		System.out.println("탈출 : " + i);
		
		for(i=10; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(i='A';i<='Z';i++) {
			System.out.print((char)i + " ");
		}
		
	}
}
