package homework;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Parking {
/*
	주차장 관리 프로그램
	**************
	   1. 입차
	   2. 출차
	   3. 리스트
	   4. 종료
	**************
	  메뉴 : 

	[1번인 경우]
	위치 입력 : 3
	3위치에 입차 / 이미 주차되어있습니다

	[2번인 경우]
	위치 입력 : 4
	4위치에 출차 / 주차되어 있지않습니다

	[3번인 경우]
	1위치 : true
	2위치 : false
	3위치 : true
	4위치 : false
	5위치 : false
*/
	public static void main(String[] args) {
		
		System.out.println("주차장 관리 프로그램");
		System.out.println("**************");
		System.out.println("1. 입차");
		System.out.println("2. 출차");
		System.out.println("3. 리스트");
		System.out.println("4. 종료");
		System.out.println("**************");
		
		boolean[] ar = new boolean[5];
		for(boolean data:ar) {
			//if(data= false) {System.out.print("가능");}
			//else {System.out.print("불가능\t \t");}
			System.out.print(data + "\t");
		}
		System.out.println();

	
		LOOP: do {

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴 : ");
			int menu = sc.nextInt();

			
			switch(menu) {
			case 1: // 입차
				System.out.print("몇번째 자리에 주차하겠습니까?  ");
				int jari;
				jari=sc.nextInt()-1;
				if(ar[jari]) {System.out.println("주차할수없습니다");}
				else{ar[jari] = true; System.out.println("주차하였습니다.");}
				//System.out.println(ar[jari]);
				break;
				
			case 2:
				System.out.print("몇번째 자리에 출차하겠습니까?  ");
				jari=sc.nextInt()-1;
				if(ar[jari]) {ar[jari]=false; System.out.println("출차중...");}
				else {System.out.println("출차할 차가 없습니다.");}
				
				break;
				
			case 3: // 리스트
				for(boolean data:ar) {
					if(!data) {System.out.print("가능\t \t");}
					else {System.out.print("불가능\t \t");}
					//System.out.print(data + "\t");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break LOOP;
			default:
			}
		}while(true);

	}
}
