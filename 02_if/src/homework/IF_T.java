package homework;

import java.util.Scanner;

public class IF_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		if(a<b && a<c) { //a가 가장 작다면
			if(b<c) {System.out.println(a+","+b+","+c);}
				else {System.out.println(a+","+c+","+b);}
		}else if(b<c) { // b가 가장 작다면
			if(a<c) {System.out.println(b+","+a+","+c);}
			else {System.out.println(b+","+c+","+a);}
		}else { //c가 가장 작다면
			if(a<b) {System.out.println(c+","+a+","+b);}
			else {System.out.println(c+","+b+","+a);}
		}
	}
}
