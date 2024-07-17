package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukSort implements SungJuk,Comparable<SungJukDTO>{
	private String name; 
	private int tot;
	

	@Override
	public int compareTo(SungJukDTO p) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***********************");
		System.out.println("\t 1.총점으로 내림차순 ");
		System.out.println("\t 2.이름으로 오름차순 ");
		System.out.println("\t 3.이전 메뉴 ");
		System.out.println("***********************");
		
		System.out.print("번호입력 : ");
		int no= scan.nextInt();
		
		if(no==1) {
			if(this.tot < p.getTot()) return 1; 
			else if(this.tot > p.getTot()) return -1; 
			else return 0;
		}else if(no==2) {
			return this.name.compareTo(p.getName());
		}else {
			return 0;
		}
		
	}


	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		compareTo(SungJukDTO)
	}


	 


}
