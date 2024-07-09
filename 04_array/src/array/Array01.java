package array;

import java.util.Arrays;

public class Array01 {
	public static void main(String[] args) {
		int[] arr; // 배열 선언
		arr = new int[5]; // 배열 생성
		
		System.out.println("배열명 arr : " + arr); // <결과: 클래스명@16진수> [I@372f7a8d
		System.out.println("배열의 크기(length) : " + arr.length);

		arr[0]=14;
		arr[1]=23;
		arr[2]=13;
		arr[3]=94;
		arr[4]=65;
		
		System.out.println("배열arr출력");
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("\n배열arr거꾸로출력");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("\n배열arr의 값 홀수찍기");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.println("arr[" + i + "] : " + arr[i]);				
			}
		}
		
		System.out.println("\n배열arr 방번호가 짝수찍기");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println("arr[" + i + "] : " + arr[i]);				
			}
		}
		
		System.out.println("\n sort메소드(오름차순)");
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		// 확장형 FOR문
		System.out.println("확장형 FOR문");
		for(int data:arr) {
			System.out.println(data);
		}
	}
}
