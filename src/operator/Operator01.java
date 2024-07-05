package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			[문제] 동전 교환
			현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
			[조건] Scanner, %
			[실행결과]
			현금 입력 : 5723
			천원 : 5장
			백원 : 7개
			십원 : 2개
			일원 : 3개
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현금입력 : ");
		int coin = scan.nextInt();

		System.out.println("천원 : " + (coin/1000) + " 장");
		System.out.println("백원 : " + (coin%1000)/100 + " 개");
		System.out.println("십원 : " + (coin%100)/10 + " 개");
		System.out.println("일원 : " + (coin%10) + " 개");
	}

}