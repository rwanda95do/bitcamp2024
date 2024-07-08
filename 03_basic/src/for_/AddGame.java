package for_;

import java.util.Random;
import java.util.Scanner;

public class AddGame {
/*
	[문제] 덧셈 계산 (for, while, 다중 for)
	- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
	- 5문제를 제공한다.
	- 1문제당 점수 20점씩 처리한다.
	- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.
	- Y/N은 대소문자 상관 없음. yn이 아니면 계속 반복 
	 
	[실행결과]
	[1] 25 + 36 = 50
	틀렸다
	[1] 25 + 36 = 59
	틀렸다 정답은 xx

	[2] 10 + 25 = 35
	딩동뎅

	[5] 78 + 95 = 89
	틀렸다
	[5] 78 + 95 = 173
	딩동뎅

	당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

	또 할래(Y/N) : A
	또 할래(Y/N) : w
	또 할래(Y/N) : n

	프로그램을 종료합니다.
*/
	public static void main(String[] args) {
		int a,b; // 난수 2개
		int dab; // 답
		int count=0; // 맞춘 문제 개수
		int score = 0;
		String yn; // 또 할지 안할지 
		
		Scanner sc = new Scanner(System.in);

		EXIT:do {
			for(int j=1; j<=5; j++) { // 1번 FOR
				a = (int)(new Random().nextDouble()*100);
				b = (int)(new Random().nextDouble()*100);
				
				int r = a+b;
				
				for(int i=0; i<2; i++) {
					System.out.print("["+j +"] "+a + " + " + b + " = ");
					dab= sc.nextInt();			
					
					if(r == dab) {
						System.out.println("정답"); 
						count+=1; score +=20;
						break;
					}else {System.out.println("오답");}
				}
			} // 1FOR 종료
			System.out.println("당신은 총 "+ count + "문제를 맞추어서 점수 " + score + "입니다.");			
			
	
			 do {
				 System.out.print("또 할래(Y/N) : ");
				 yn = sc.next();
				 if(yn.equals("N") || yn.equals("n")) {break EXIT;}
				 else if(yn.equals("Y") || yn.equals("y")) {break;}
				 else {continue;}
			 }while(true);
			
			 
		}while(true);
		
		
	} // main
} //AddGame ClASS

