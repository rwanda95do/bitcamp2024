package class__;

import java.util.Scanner;

public class StringButterMain {
	
	private int dan;
	
	// 생성자 ------------------
	public StringButterMain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단: ");
		
		dan = sc.nextInt();
	}
	
	// -------------
	public void output() {
		StringBuffer buffer = new StringBuffer();
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + "*" + i +"="+dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer);
			
			// 기존의 있는 내용을 삭제하려면?
			buffer.delete(0, buffer.length());
		}
	}
	
	// -----------------------
	public static void main(String[] args) {
		new StringButterMain().output();
	}
	
}
