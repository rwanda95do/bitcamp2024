package while_;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		/*
		[문제] 숫자 맞추기 게임
		- 숫자의 범위는 1 ~ 100 사이로 한다.
		- 컴퓨터가 숫자를 발생하면 사용자가 맞추는 프로그램이다.
		[실행결과]
		1 ~ 100 사이의 숫자가 발생했습니다. (87)
		
		숫자 입력 : 50
		50보다 큰 숫자입니다.

		숫자 입력 : 95
		97보다 작은 숫자입니다.

		~~~

		숫자 입력 : 87
		딩동뎅...x번만에 맞추셨습니다.

		 */
		
		int count = 0;
		int user = 0;
		int com = (int)(new Random().nextDouble()*100)+1;
		Scanner sc = new Scanner(System.in);

		System.out.println("랜덤의 숫자가 발생했습니다. : " + com);
	
		while(true) { //무한반복
			System.out.print("숫자 입력 : ");
			user = sc.nextInt();
			
			count++;
			
			if(user == com) {
				break;
			}else if (user>com) {
				System.out.println(user + "보다 작은 숫자입니다.");
			}else {
				System.out.println(user + "보다 큰 숫자입니다.");
			}
		}
		
		System.out.println("딩동댕~ " + count + "번 만에 맞추어습니다.");
		
	}
}
