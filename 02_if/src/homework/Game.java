package homework;

import java.io.IOException;
import java.util.Scanner;



public class Game {
	public static void main(String[] args) throws IOException {
		/*
		[문제] 가위 바위 보 게임
		- 가위(1), 바위(2), 보자기(3)으로 설정한다.
		- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
		- 기본 금액은 1000원을 기본으로 설정한다.

		[실행결과]
		가위(1), 바위(2), 보자기(3) 입력 : 1
		배팅 금액 : 600

		결과를 보시려면 Enter를 치세요

		컴퓨터 바위, 나는 가위
		ㅠㅠ..졌다
		현재 금액은 400윈
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보자기(3) 입력 ");
		int MY = sc.nextInt(); // 내가 내는 거 
		int MyCost = 1000; // 내가 가지고 있는 금액
		
		System.out.print("배팅금액 : ");
		int GameCost = sc.nextInt(); // 배팅금액 입력
		
		int COM = (int)(Math.random()*10)%3 +1;
		
		String winner ="";
		//MyCost -= GameCost;
		
		if(GameCost>MyCost){
			System.out.println("배팅금액이 소지금보다 커 게임을 진행할 수 없습니다.");
		}else { // 배팅금이 소지금 보다 낮아서 게임 가능 
			//가위바위보
			if(MY==1) { // 내가 가위
				switch(COM) {
				case 1: winner = "무승부"; MyCost-=GameCost; break;
				case 2: winner = "컴퓨터"; MyCost-=GameCost; break;
				case 3: winner = "나"; MyCost+=GameCost; break;
				default:
				}
			}else if(MY==2) { // 내가 바위
				switch(COM) {
				case 1: winner = "나"; MyCost+=GameCost; break;
				case 2: winner = "무승부"; MyCost-=GameCost; break;
				case 3: winner = "컴퓨터"; MyCost-=GameCost; break;
				default:
				}	
			}else { // 내가 보
				switch(COM) {
				case 1: winner = "컴퓨터"; MyCost-=GameCost; break;
				case 2: winner = "나"; MyCost+=GameCost; break;
				case 3: winner = "무승부"; MyCost-=GameCost; break;
				default:
				}
			}
			// 나와 컴의 결과를 한글로 보여주기
			String MyR = "",ComR="";
			switch(MY) {
			case 1: MyR="가위";break;
			case 2: MyR="바위";break;
			case 3: MyR="보";break;
			default:
			}
			switch(COM) {
			case 1: ComR="가위";break;
			case 2: ComR="바위";break;
			case 3: ComR="보";break;
			default:
			}
			
			System.out.println("결과를 보시려면 ENTER을 치세요 ");
			System.in.read();
			
			System.out.println("컴퓨터 : " + ComR + ", 나 : " + MyR );
			System.out.println("승자 : " + winner);
		}
		System.out.println("현재 금액 : " + MyCost);
		
		
		
		
	}
}
