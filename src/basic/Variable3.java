package basic;

import java.util.Random;

public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.max(double a, double b)
		int big = Math.max(25, 36); 
		System.out.println("큰값 = " + big);
		// Math.min(double a, double b)
		double small = Math.min(12.5, 78.5); 
		System.out.println("작은값 = " + small);
		// Math.pow(double a, double b)
		double power = Math.pow(2, 5);
		System.out.println("2의 5승 = " + power);
		
		// 난수 Math.random()
		double r = Math.random();
		System.out.println(r);
		// 난수 Random클래스
		double r1 = new Random().nextDouble();
		System.out.println(r1);
		
		int c = (int)(r*100);
		System.out.println(c);
		//65~90 사이의 난수 
		int d = (int)(Math.random() * 25 + 65);
		System.out.println("65~90사이의 난수 : " + d);
	}
}
