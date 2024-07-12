package class__;

import java.util.Scanner;



/*
클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private chexams[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 써서 이름, 답을 입력 받는다.
compexamse() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 3

이름 입력 : 홍길동
답 입력 : 12311

이름 입력 : 김태리
답 입력 : 12341 

이름 입력 : 유연석
답 입력 : 12111 

이름 1 2 3 4 5 점수
홍길동  O X X O O 60
김태리  O X X X O 40
유연석  O X O O O 80s
*/

public class ExamMain {
	public static void main(String[] examsgs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int num = sc.nextInt();
		
		Exam[] exams = new Exam[num];
		
		for(int i=0; i<num; i++) {
			exams[i]= new Exam();
		}
		
		System.out.println("이름\t1  2  3  4  5  \t점수");
		 for(int i=0; i<num; i++) {
			 System.out.print(exams[i].getName() + "\t");
			 for(int j=0; j<exams[i].getOx().length;j++) {
				 System.out.print(exams[i].getOx()[j] + "\t");				 
			 }
			 System.out.println("\t" + exams[i].getScore());
		 }//for i

	}
}
