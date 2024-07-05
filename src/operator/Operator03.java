package operator;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		int a = 5;
		a += 2; // a=a+2
		a *= 3; // a=a*3
		System.out.println("a= " + a);
		
		a++;
		System.out.println("a= " + a);
		
		int b = a++;
		System.out.println("a= " + a + ", b = " + b);
		
		int c = ++a - b--;
		System.out.println("a= " + a + ", b = " + b + ", c = " + c);
		
		System.out.println("a++ = " + a++);
		System.out.println("a= " + a);
		
		
	}
}
