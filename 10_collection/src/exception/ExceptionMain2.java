package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionMain2 {
	
	private int x, y;
	
	public void input() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x : ");
		x= Integer.parseInt(br.readLine());
		
		System.out.print("y : ");
		y= Integer.parseInt(br.readLine());
	/*
		Scanner scan = new Scanner(System.in);
		System.out.print("x : ");
		x=scan.nextInt();
		System.out.print("y : ");
		y=scan.nextInt();
	*/
	}
	
	public void output() {
		int mul = 1;
		if(y>=0) {
			for(int i=1; i<=y; i++) {
				mul *= x;
			}
			System.out.println(mul);
		}else {
			System.out.println("y는 0보다 크거나 같아야한다");
			try {
				throw new Exception("y는 0보다 크거나 같아야한다");// 강제로 Excection발생				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
	}
}
