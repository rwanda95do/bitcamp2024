package if_;

import java.io.IOException;

public class Input {
	public static void main(String[] args) throws IOException {
		System.out.print("문자입력 : ");
		int a = System.in.read();	// 1개의 문자 입력
	
		System.in.read();	// flush : 버퍼 처리 
		System.in.read();	// Enter : \r, \n
		
		System.out.print("문자입력 : ");
		int b = System.in.read();	// 1개의 문자 입력
		
		System.out.println();
		System.out.println("a : " + (char)a);
		System.out.println("b : " + b);
	}
}
