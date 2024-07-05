package swith_;

import java.io.IOException;
import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) throws IOException {
		/*
		2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오
		단, 정수형 숫자는 Scanner를 사용하고, 연산자는 System.in.read()를 사용하여 입력하시오

		[실행결과]
		a의 값 : 25
		b의 값 : 36
		연산자(+,-,*,/)를 입력 : +

		25 + 36 = xx

		a의 값 : 25
		b의 값 : 36
		연산자(+,-,*,/)를 입력 : /

		25 / 36 = 0.6944444444444444

		a의 값 : 25
		b의 값 : 36
		연산자(+,-,*,/)를 입력 : #

		연산자 error
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/) 입력 : ");
		char operator = (char)System.in.read(); //연산자 입력받은거 숫자로 저장됨
		System.in.read();	// Enter 버퍼 처리
	
		
		double result =0;
		
		switch(operator) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = (double)a * b; break;
			case '/': result = (double)a / b; break;
			default: 
		}

		System.out.println(a  +" " + (char)operator +" " + b + " = " + result);
		
	}
}