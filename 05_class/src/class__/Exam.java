package class__;

import java.util.Scanner;

public class Exam {
	Scanner sc = new Scanner(System.in);

	private String name ;
	private String dap ;
	private char[] ox = new char[5];;
	private int score = 0;
	private final String JUNG = "11111";

	// 생성자 -----------------------
	Exam() {
		System.out.print("이름 입력 : ");
		name = sc.next();

		System.out.print("답 입력 : ");
		dap = sc.next();
		
		compare();
	}
	

	// GETTER -----------------
	public String getName() {
		return name;
	}

	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}

	// 메소드 ----------------
	public void compare() {
		// 정답 비교
		// OX바꿔주고
		// 점수 매기고
		for (int j = 0; j < JUNG.length(); j++) { // 5문제
			if (JUNG.charAt(j)== dap.charAt(j)) {
				ox[j] = 'O';
				score += 20;
			} else {
				ox[j] = 'X';
			}

			System.out.println();
		} // for i

	}

} // CLASS : Exam