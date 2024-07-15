package homework_T;

import java.util.Scanner;

public class Exam {
	private String name= null;
	private String dap= null;
	private char[]ox=null;
	private int score=0;
	final String JUNG = "11111";
	
	public Exam() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름입력 : ");
		this.name = scan.next();
		System.out.println("답입력 : ");
		this.dap = scan.next();
		
		ox = new char[5];  // 5문제	
	} // Exam() 생성자
	
	public void compare() {
		// 사람이 적은 답의 기준으로 FOR을 돌린다. 
		for (int j = 0; j < ox.length; j++) { // 5문제
			if (JUNG.charAt(j)== dap.charAt(j)) {
				ox[j] = 'O';
				score += 20;
			} else {
				ox[j] = 'X';
			}
		} // FOR
		
	} //compare()메소드
	
	public String getName() {return name;}
	public char[] getOx() {return ox;}
	public int getScore() {return score;}
	
	
} //CLASS
