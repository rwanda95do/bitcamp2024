package if_;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터입력 : ");
		int a = sc.nextInt();
		
		/*
		if(a>=50) System.out.println(a+"는 50보다 크거나 같다.");
		System.out.println(a + "는 50보다 작다");
		
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		
		if(false)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		*/
		
		//[문제] 숫자를 영문자로 바꾸는데, 대문자이면 소문자로 소문자면 대문자로
		
		System.out.println("대문자 : " + (char)a);
		System.out.println("소문자 : " + (char)(a+32));
	}
}
