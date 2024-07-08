package for_;

import java.util.Scanner;

public class For05 {
/*
[문제] x와 y의 제곱승을 구하시오 - while, for
- y의 값이 음수가 들어오면 다시 입력한다.
- x의 값이 0이 프로그램 종료한다. 

[실행결과]
x : 2
y : 5
2의 5승 32

x : 2
y : -2
y : 7
2의 5승 128

x : 0
프로그램을 종료합니다.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sum = 1;

			System.out.print("x : ");
			int x = sc.nextInt();
			if(x==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("y : ");
			int y = sc.nextInt();
			if(y<0) {
				System.out.print("y : ");
				y = sc.nextInt();
			}
			for(int i=1; i<=y; i++) {
				sum *= x;
			}
			System.out.println(x + "의 " + y + "승 : " + sum);
		}
	
	}
}
