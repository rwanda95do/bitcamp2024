package basic;

public class Variable {

	public static void main(String[] args) {
		/*
		// 상수 & 아스키코드 & 형변환(CAST)
		//
		System.out.println('A' + 32);  // 기본은 숫자로 보여준다.
		System.out.println((char)('A' + 32));  // 문자로 보고 싶으면, 강제형변환 Cast연산
	
		System.out.println(2 + 3);
		System.out.println('2' + '3');
		
		
		//Integer.parseInt()
		System.out.println("2" + "3");
		System.out.println(Integer.parseInt("2") + Integer.parseInt("3"));
		
		
		//Double.parseDouble()
		System.out.println("12.5" + "36.8");
		System.out.println(Double.parseDouble("12.5") + Double.parseDouble("36.8"));
		*/
		
		//변수
		//
		// boolean
		boolean a = 25>36;
		System.out.println(25>36);
		System.out.println(a);
		System.out.println(25<36);
		
		
		//char(2Byte)
		char b = 'A';  // 00000000 01000001 
		System.out.println(b);
		char c = 65; // 00000000 01000001, 자료형 char이라서 숫자로 저장되지 않음.
		System.out.println(c);
		
		
		//int (4Byte)
		int e = 65;  // 00000000 00000000 00000000 01000001 
		System.out.println(e);
		int f = 'A';
		System.out.println(f);
		
		long g = 25L;  // long형 상수
		System.out.println(g);
		
		//43.8은 double
		// 오류: float h = 43.8;
		float h = 43.8f;  // 방법1. float형 상수
		float i = (float) 43.8;  // 방법2. casting 
		
	}

}