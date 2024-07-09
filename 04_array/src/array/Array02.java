package array;

import java.util.Arrays;

public class Array02 {
	public static void main(String[] args) {

		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
			System.out.println("문자열의 크기 : " + args[i].length()); //배열의 크기 : args.length, 문자열의 크기 : args.length()
			System.out.println("첫번째문자 : "+args[i].charAt(0));
			System.out.println("마지막문자 : "+args[i].charAt(args[i].length()-1));
			System.out.println();
		}
		
		// 확장형 FOR문 
		for(String data:args) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
		// sort()
		Arrays.sort(args);  //ASCII 코드 순서로 오름차순
		for(String data:args) {
			System.out.print(data + "\t");
		}
		System.out.println();
		
	}
}
