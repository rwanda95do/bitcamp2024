package multiArray;

import java.util.Scanner;

public class Baseball {
/*
	[문제] 야구게임
	크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
	발생한 수를 맞추는 게임
	중복은 제거한다

	[실행결과]
	게임을 실행하시겠습니까(Y/N) : w
	게임을 실행하시겠습니까(Y/N) : u
	게임을 실행하시겠습니까(Y/N) : y

	게임을 시작합니다

	숫자입력 : 123
	0스트라이크 0볼

	숫자입력 : 567
	0스트라이크 2볼

	숫자입력 : 758
	1스트라이크 2볼
	...

	숫자입력 : 785
	3스트라이크 0볼

	프로그램을 종료합니다.
*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int[] com = new int[3];
		
		while(true){
			System.out.println("게임을 실행하시겠습니까(Y/N) :");
			String game = sc.next();
			
			if(game.equals("y")||game.equals("Y")) {
				System.out.println("게임을 시작합니다.");
				
				int[] user = new int[3];
				
				//-----------------------------------
				// user가 중복값을 입력하지 못하게도 해야되는건가..
				for(int i=0; i<user.length; i++) {			 
					//중복 체크
					for(int j=0; j<i; j++) {
						if(user[i] == user[j]) {
							i--; 
							// 숫자 입력 받아서 user 넣기--------
							System.out.print("숫자입력 : ");
							String tmp =sc.next();
							for(int k=0; k<user.length; k++) {
								user[k] = tmp.charAt(k)-'0';
							}
							break;
						}
					}
				}//
				
				
				int[] com = new int[3];
				//com 난수 발생-------------------
				for(int i=0; i<com.length; i++) {
					com[i] = (int)(Math.random()* 9 + 1);
					
					//중복 체크
					for(int j=0; j<i; j++) {
						if(com[i] == com[j]) {
							i--; 
							break;
						}
					}
				}//
				
				// 스트라이크 볼 확인---------------
				int strike=0, ball=0;  //strike = ball= 0;
				
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(i==j) { // 같은자리
							if(com[i]==user[j]) {
								strike ++;
							}
						}else { // 다른자리
							if(com[i]==user[j]) {
								ball ++;
							}
						}
					}
				}
				
				
				//-----------------------------
				for(int i=0; i<com.length; i++) {
					System.out.print(com[i]);
				}
				System.out.println();
				for(int i=0; i<user.length; i++) {
					System.out.print(user[i]);
				}
				System.out.println();
				System.out.println("strike : "+ strike + " ball : " + ball);
				
				//---------------------------
				//break;
			}else if(game.equals("n")||game.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		
	} //main
}
