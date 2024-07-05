package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[문제] 월급 계산 프로그램
		//이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오    
		//합계 = 기본급 + 수당
		//세금 = 합계 * 0.03
		//월급 = 합계 - 세금

		//[조건]
		//2. 숫자는 3자리마다 , 표시
		//3. 소수이하는 표시하지 않는다. (정수형)  

		//[실행결과]
		//이름 입력 : 홍길동
		//직급 입력 : 부장
		//기본급 입력 : 4900000
		//수당 입력 : 200000

		//*** 홍길동 부장 월급 ***
		//기본급 : 4,900,000원
		//수당 : 200,000원
		//합계 : 5,100,000원
		//세금 : 153,000원
		//월급 : 4,947,000원
		
		String name, rank; 
		int BasicPay, ExtraPay;
		double tot=0, tax=0, salary=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("직급 입력 : ");
		rank = scan.next();
		System.out.print("기본급 입력 : ");
		BasicPay = scan.nextInt();
		System.out.print("수당 입력 : ");
		ExtraPay = scan.nextInt();
		
		tot = BasicPay + ExtraPay;
		tax = tot * 0.03;
		salary = tot - tax;
		
		System.out.println("*** "+ name + " " +rank +" 월급 ***");
		System.out.println("기본급 : " + new DecimalFormat().format(BasicPay) +"원");
		System.out.println("수당 : " + new DecimalFormat().format(ExtraPay)+"원");
		System.out.println("합계 : " + new DecimalFormat().format((int)tot)+"원");
		System.out.println("세금 : " + new DecimalFormat().format((int)tax)+"원");
		System.out.println("월급 : " + new DecimalFormat().format((int)salary)+"원");
	}

}