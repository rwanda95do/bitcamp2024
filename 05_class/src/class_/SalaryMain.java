package class_;

import java.text.DecimalFormat;

public class SalaryMain {
/*
	[문제] 월급 계산 프로그램
	1. 세율
	합계가 5,000,000원 이상이면 3% (0.03)
	     3,000,000원 이상이면 2% (0.02)
	     아니면 1% (0.01)
	2. 숫자는 3자리마다 , 표시
	3. 소수이하는 표시하지 않는다. (정수형)

	클래스명 : SalaryDTO
	필드 : name, job, basic, extra, total, rate, tax, salary
	메소드 : setData(이름, 직급, 기본급, 수당)
	       calc() - 합계, 세율, 세금, 월급 계산
	   getName()
	   getJob()
	   getBasic()
	   getExtra()
	       getTotal()
	       getRate()
	       getTax()
	       getSalary()

	클래스명 : SalaryMain

	[실행결과]
	이름 직급 기본급 수당 합계 세율 세금 월급
	------------------------------------------------------------------------
	홍길동 이사 4,800,000 300,000
	송중기 사원 2,000,000 100,000
	아이유 주임 2,900,000 150,000

*/
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("###,###");
		
		SalaryDTO ar[] = new SalaryDTO[3];
		for(int i =0; i<ar.length; i++) {
			ar[i] = new SalaryDTO();			
		}
		
		ar[0].setData("홍길동", "이사", 4800000, 300000);
		ar[1].setData("송중기", "사원", 2000000, 100000);
		ar[2].setData("아이유", "주임", 2900000, 150000);
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
		}
		
		
	// 출력 --------------------------------------------	
		System.out.println("이름\t 직급\t 기본급\t\t 수당\t\t 합계\t\t 세율\t 세금\t 월급");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i].getName()+"\t ");
			System.out.print(ar[i].getJob()+"\t ");
			System.out.print(decimalFormat.format(ar[i].getBasic())+"\t ");
			System.out.print(decimalFormat.format(ar[i].getExtra())+"\t ");
			System.out.print(decimalFormat.format(ar[i].getTotal())+"\t ");
			System.out.print(ar[i].getRate()+"\t ");
			System.out.print(decimalFormat.format(ar[i].getTax())+"\t ");
			System.out.print(decimalFormat.format(ar[i].getSalary())+"\t ");
			
			
			
			System.out.println();
		}
	}
}
