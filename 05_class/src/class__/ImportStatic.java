package class__;

// import static를 선호하지않는

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.*;  // 비추천

//import java.util.Arrays;
import static java.util.Arrays.sort;


public class ImportStatic {
	public static void main(String[] args) {
		//System.out.println("난수 : " + Math.random());
		System.out.println("난수 : " + random());
		
		//System.out.println("2의 5승" + Math.pow(2,5));
		System.out.println("2의 5승" + pow(2,5));
		
		int[] ar = {25, 78, 32, 40, 55};
		
		//Arrays.sort(ar);
		sort(ar);
		for(int data:ar) {
			System.out.print(data + "  ");
		}
		
		System.out.println();
		
		String[] ar2 = {"apple", "strawberry", "applemango","pineapple","tomato"};
		sort(ar2);
		for(String data:ar2) {
			System.out.print(data + "  ");
		}
		
	}
}
