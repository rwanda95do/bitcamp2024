package io;

public class Test {
	public static void main(String[] args) {
		int i=0, hap=0;
		
		do {
			++i;
			hap += i;
			System.out.println(i + "  " + hap);
		}while (i<5);
		System.out.println(i + "  " + hap);
		}
}
