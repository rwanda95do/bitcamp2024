package interface_Compute;

import java.util.Scanner;

public class ComputeService {
	public void menu(){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		Compute compute = null; // 부모는 new를 할 필요가 없다. 
		
		while(true) {
			System.out.println();
			System.out.println("***********************");
			System.out.println("\t 1.합 ");
			System.out.println("\t 2.차 ");
			System.out.println("\t 3.곱 ");
			System.out.println("\t 4.몫 ");
			System.out.println("\t 5.끝내기 ");
			System.out.println("***********************");
			
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			if(num == 5) {break;}
			if(num == 1) {
				compute = new Sum();
			} else if(num ==2) {
				compute = new Sub();
			} else if(num ==3) {
				compute = new Mul();
			} else if(num ==4) {
				compute = new Div();
			} 
			compute.execute();
			
			
			break;
		}
	} // menu()


}
