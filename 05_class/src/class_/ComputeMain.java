package class_;

import java.util.Scanner;

public class ComputeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수 입력 :");
		int size = sc.nextInt(); // size:계산횟수
		ComputeDTO[] ar = new ComputeDTO[size];
		
		for(int i =0; i<ar.length; i++) {
			ar[i] = new ComputeDTO();
			
			System.out.print("x 입력 : ");
			ar[i].setX(sc.nextInt());
			System.out.print("y 입력 : ");
			ar[i].setY(sc.nextInt());
			
			ar[i].calc();
			
		}
		
		
		
		//System.out.println("ar[i] : "+ar[i]);  //this확인하기 위해서
		
		
		System.out.println("X\tY\tSum\tSub\tMul\tDiv");
		 for(ComputeDTO data : ar) {
		 System.out.println(data.getX()+"\t"
		 + data.getY()+"\t"
		 + data.getSum()+"\t"
		 + data.getSub()+"\t"
		 + data.getMul()+"\t"
		 + data.getDiv());
		 }//for
	}
}
