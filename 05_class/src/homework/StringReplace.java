package homework;

import java.util.Scanner;

/*
[문제]
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

*/


// 결국.. 못 품... 
// indexof("문자열",시작위치)

public class StringReplace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next();
		System.out.print("현재 문자열 입력 : ");
		String targetStr = scan.next();
		System.out.print("바꿀 문자열 입력 : ");
		String chateStr = scan.next();
		
		
	//	int a =inputStr.indexOf("aa", 0);
	//	System.out.println(a);
		
		if(inputStr.length()<targetStr.length()) {
			System.out.println("입력한 문자열의 크기 작습니다.");
		} else {
			int index = 0;
			int count = 0; 
			
			while((index=inputStr.indexOf(targetStr, index)) != -1){
				// index=-1, 찾을 값이 없다는 것을 의미
				index += targetStr.length();
				count ++;
				
				
			} // WHILE
			
			System.out.println(inputStr.replace(targetStr, chateStr));
			System.out.println(count + "개 치환");
			
			
		} // IF-ELSE
		
		
	}

}
