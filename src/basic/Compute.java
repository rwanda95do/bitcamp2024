package basic;

import java.text.DecimalFormat;

public class Compute {

	public static void main(String[] args) {
		//Q. 변수를 이용하여 a=320, b=258의 합(sum), 차(sub), 곱(mul), 몫)(div)를 구하시오
		short a = 320, b=258;
		
		int sum, sub, mul;
		float div;
		
		
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = (float)a / (float)b;  // a와 b를 정수형으로 저장했기 때문에 애네도 형변환을 해주지 않으면 
									// 아무리 div 함수가 실수형이여도 나머지가안나옴... 
		
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
		
	}

}
