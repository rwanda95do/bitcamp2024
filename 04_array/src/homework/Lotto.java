package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lotto {
	public static void main(String[] args) {
		// [문제] 자동 번호 로또 만들기
		int cost = 1000; //한줄비용 1000원
		//현금입력
		Scanner sc = new Scanner(System.in);
		System.out.print("현금입력 : ");
		int money = sc.nextInt();
		int round = money/cost;  // 몇줄
		System.out.println("몇줄 : " + round);
		
		for(int j=1; j<=round; j++) {
			// 1부터 45까지 정수형 6ㄱㅐ 배열
			System.out.print(j +" : " );
			int[] lotto = new int[6];
			// 로또 0으로 초기화

			for(int i=0; i<lotto.length; i++) {
				lotto[i] = new Random().nextInt(45)+1;								
			} // LOTTO 6자리				
			
			// 중복된 숫자를 가지면 안됨.(랜덤) < 헤야함
			
			
			// 오름차순
			Arrays.sort(lotto);
			
			for(int d:lotto) {
				// 출력시 5자리로 맞추기
				System.out.print(String.format("%5d", d));
			}
			System.out.println();
			
			// 5줄 마다 줄바꿈
			if(j%5==0) {System.out.println();}
			
		} // FOR 몇줄 출력할지
		
		
		

		

		
	}
}
