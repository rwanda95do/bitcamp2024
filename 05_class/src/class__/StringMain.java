package class__;

public class StringMain {

	public StringMain() {
		/*
		String aa = "apple"; //aa와 bb는 같은 주소와 같은 값을 가르킨다.
		String bb = "apple";
		
		if(aa==bb) System.out.println("aa와 bb의 참조값이 같다");
		else System.out.println("aa와 bb의 참조값이 다르다");
		
		if(aa.equals(bb)) System.out.println("aa와 bb의 문자열이 같다");
		else System.out.println("aa와 bb의 문자열이 다르다");
		// ---------------------------------
		String cc = new String("apple");StringMain //cc와 dd는 서로 다르게 만든 녀석 = 주소가 다름
		String dd = new String("apple");
		
		if(cc==dd) System.out.println("aa와 bb의 참조값이 같다");
		else System.out.println("aa와 bb의 참조값이 다르다");
		
		if(cc.equals(dd)) System.out.println("aa와 bb의 문자열이 같다");
		else System.out.println("aa와 bb의 문자열이 다르다");
		*/
	//---------------------------------------------
		String e = "오늘 날짜는 " + 2023 + 12 + 29;
		System.out.println("문자열 크키 " + e.length());
		
		System.out.println("5번째 위치 문자 " + e.charAt(5));
		
		System.out.println("부분 문자열 추출 " + e.substring(7));
		System.out.println("부분 문자열 추출 " + e.substring(7,11));
		
		System.out.println("대문자 변경 " + "Hello".toUpperCase());
		System.out.println("소문자 변경 " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 " + e.indexOf("짜"));
		System.out.println("문자열 검색 " + e.indexOf("날짜"));
		System.out.println("문자열 검색 " + e.indexOf("개바부")); // -1 : 현재 찾는 문자가 없다
		
		System.out.println("문자열 치환 " + e.replace("날짜", "일자"));
		
		
	}

	
	public static void main(String[] args) {
		new StringMain();

	} // main()
}
