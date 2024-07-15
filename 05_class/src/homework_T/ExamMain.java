package homework_T;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원수 입력 : ");
		int size = scan.nextInt();
		
		Exam[] ar = new Exam[size];
		for (int i=0; i<size; i++) {
			ar[i] = new Exam();
			ar[i].compare(); // 왜 요기서 비교하는 건가요?
		}
		
		
		// 출력 ------------------------------------
		for(int i=0; i<size; i++) {
			System.out.print(ar[i].getName() + "\t");
			
			for(int j=0; j<ar[i].getOx().length; j++) {
				System.out.print(ar[i].getOx()[j] + "\t");
			}
			System.out.println(ar[i].getScore());
		}
		
	}
}
