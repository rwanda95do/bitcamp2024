package for_;

import java.io.IOException;
import java.util.Scanner;

public class For02 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("원하는 단을 입력 : ");
		int num = System.in.read() - '0';
		// 주의 System.in.read()로 입력 받으면 문자 형식으로 받는다! 
		
		
		System.out.println(num);
		
		System.out.println("구구단 : " + num + "단");
		for(int i=1; i<=9; i++) {
			System.out.println(num +" * " + i + " = " + (num*i));
		}
	}
}
