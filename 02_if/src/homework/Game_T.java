package homework;

import java.io.IOException;
import java.util.Scanner;

public class Game_T {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int com, user;
		int money = 1000;
		int coin; // 배팅금액

		com = (int)(Math.random()*3+1);
		System.out.println("com :" + com);
		
		System.out.print("가위1, 바위2, 보3 입력: ");
		user = sc.nextInt();
		
		System.out.print("배팅금액 : ");
		coin = sc.nextInt();
		
		System.out.println("결과를 보려면 ENTER를 치세요");
		System.in.read();
		
		//가위바위보 게임
		if(com ==1) { // 컴이 가위
			if(user==1) {
				System.out.println("컴 : 가위, 나 : 가위"); 
				System.out.println("비김");
			}else if(user==2) {
				System.out.println("컴 : 가위, 나 : 바위"); 
				System.out.println("이김");
				money+=coin;
			}else{
				System.out.println("컴 : 가위, 나 : 보"); 
				System.out.println("짐");
				money-=coin;
			}
		} else if(com ==2) { // 컴이 바위
			if(user==1) {
				System.out.println("컴 : 바위, 나 : 가위"); 
				System.out.println("짐");
				money-=coin;
			}else if(user==2) {
				System.out.println("컴 : 바위, 나 : 바위"); 
				System.out.println("비김");
			}else{
				System.out.println("컴 : 바위, 나 : 보"); 
				System.out.println("이김");
				money+=coin;
			}
		}else{ // 컴이 바위
			if(user==1) {
				System.out.println("컴 : 보, 나 : 가위"); 
				System.out.println("이김");
				money+=coin;
			}else if(user==2) {
				System.out.println("컴 : 보, 나 : 바위"); 
				System.out.println("짐");
				money-=coin;
			}else{
				System.out.println("컴 : 보, 나 : 보"); 
				System.out.println("비김");
			}
		}

		System.out.println(money);
		
	}
}

