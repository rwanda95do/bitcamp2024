package exception;

import java.util.Scanner;

public class ExceptionMain {
	// run as configuration -> args에 데이터 넣어주고
	public static void main(String[] args) {
		
	// 1. 비즈니스 로직을 이용해서 Error 막기	
		if(args.length !=0) System.out.println("args[0]" + args[0]);
		System.out.println();
		
	// 2. try~catch
		try {
			int num1 = Integer.parseInt(args[0]);
			
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자입력 : ");
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
		} catch(NumberFormatException e) {
			System.out.println("어이 지금 ERROR났따!!!!  NumberFormatException(숫자형식으로 넣으세요) ");
			e.printStackTrace();  // 에러도 보여준다.
		} catch(ArithmeticException e) {
			System.out.println("어이 지금 ERROR났따!!!  하하하 누가 0으로 나누냨ㅋㅋㅋㅋㅋㅋㅋ");
			e.printStackTrace();
		} finally {
			System.out.println("데이터베이스 할 때 많이 써야한다");
		}
		
		
		
	}
}
