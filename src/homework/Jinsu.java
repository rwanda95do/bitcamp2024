package homework;

import java.util.Scanner;

public class Jinsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[문제] 정수형 데이터를 입력하여 2진수 8진수 16진수로 변환하여 값을 출력하시오
		//[조건] 2진수 8진수 16진수로 변환시켜주는 메소드 이용하기 - Integer
		//[실행결과]
		// 10진수 데이터 입력 : 250
		// 2진수 = 1111 0000
		// 8진수 = 372
		// 16진수 = fa

		Scanner scan = new Scanner(System.in);
		System.out.print("10진수 데이터 입력 : ");
		int dec = scan.nextInt();
		
		String bin = Integer.toBinaryString(dec);
		String oct = Integer.toOctalString(dec);
		String hex = Integer.toHexString(dec);

		System.out.println("2진수 : " + bin);
		System.out.println("8진수 : " + oct);
		System.out.println("8진수 : " + hex);
	}

}
