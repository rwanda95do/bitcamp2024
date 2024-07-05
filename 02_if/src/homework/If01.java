package homework;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		/*

		[실행결과]
		a의 값 : 98
		b의 값 : 90
		c의 값 : 85

		85 90 98

		a의 값 : 75
		b의 값 : 25
		c의 값 : 36

		25 36 75
		*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int L=0, M=0, S=0;
		
		if(a>b && a>c) { // a가 가장 클때
			L=a;
			if(b>c) {M=b; S=c;}else {M=c; S=b;}
			
		}else if(a>b && a<c) { // c가 가장 클때
			L=c;
			if(a>b) {M=a; S=b;}else {M=b; S=a;}
			
		}else { // b가 가장 클때
			L=b;
			if(a>c) {M=a; S=c;}else {M=c; S=a;}
		}
		
		System.out.println(S + " " + M + " " + L + " " );
		
	}
}
