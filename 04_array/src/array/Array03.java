package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 입력");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		//입력
		for(int i = 0; i<size; i++) {
			System.out.print("arr["+ i +"]입력 : ");
			arr[i]=sc.nextInt();
		}
		//출력
		for(int data : arr) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
		//배열의 크기 합
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		System.out.println("배열의 합 : " + sum);
		
		// MAX
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
		
	}
}
