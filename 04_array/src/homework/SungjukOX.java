package homework;

import java.util.Scanner;

public class SungjukOX {
/*
	[문제] 성적처리 프로그램
	- 5문제는 사지선다형 문제이다
	- 정답은 "11111"
	  static final String jung = "11111"; //상수화
	- 1문제당 20점씩 한다.
	  
	[실행결과]
	인원수 입력 : 2

	이름 입력 : 홍길동
	답안지 입력 : 12311

	이름 입력 : 코난
	답안지 입력 : 11311

	*** 성적표 ***
	이름 1 2 3 4 5 점수
	홍길동 O X X O O 60
	코난 O O X O O 80

*/
	static final String JUNG = "11111"; //상수 (변하지 않는 값) -> final
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인원수 입력----------------------
		System.out.print("인원수 입력 : ");
		int num = sc.nextInt();		// 인원수
		
		// 변수들--------------------------
		String[] name = new String[num];	// 이름
		String dap;							// 사용자가 입력하는 답
		// 또는 String[] ox = new String[2];
		int[] score = new int[num];			// 점수
		char[][] ox = new char[num][5]; 

	// 입력 & 비교-------------------------------
		for(int k=0; k<num; k++) {
					
			// 이름 입력-----------------------
			System.out.print("이름 입력 : ");
			name[k]=sc.next();
			System.out.print("답안지 입력 : ");
			dap = sc.next();
			
			// 입력한 답이랑 정답이랑 맞는지 비교-----
			for(int i=0; i<5; i++) {
				if(SungjukOX.JUNG.charAt(i) == dap.charAt(i)) {
					score[k] += 20;
					ox[k][i]='O';
				}else {	
					ox[k][i]='X';
				}
			}	
			
			// 점수---------------------
			
			//출력-----------------------
			
			for(int j=0; j<ox[k].length; j++) { // 열
				System.out.print(ox[k][j]);
			}
			System.out.println(score[0]);
			System.out.println();
			
			
		} // 입력 for 인원수만큼 반복
		
		
		//왜 ox가 초기화가 안되지 선언하는 방법이 뭐지..?	
	// 출력----------------------------------
		System.out.println("*** 성적표 ***");
		System.out.println("이름 \t1 \t2 \t3 \t4 \t5 \t점수");
		for(int i=0; i<num; i++) {
			System.out.print(name[i] +"\t");
			for(int j=0; j<5; j++) {
				System.out.print(ox[i][j] + "\t");
			}
			System.out.println(score[i]);
		} // 출력 for 종료	
		
		
	} // main
	
}
