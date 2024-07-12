package class__;

public class VarArgs {
	// 인수의 개수를 자유롭게 구현 -> 내부적으로 배열로 인식
	public int sum(int...ar) {
		int hap = 0;
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
			hap += ar[i];
		}
		return hap;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("va.sum(10,20) =" + va.sum(10,20));
		System.out.println("va.sum(10,20,30) = " + va.sum(10,20,30));
		System.out.println("va.sum(10,20,30,40) = " + va.sum(10,20,30,40));
		
	} // main
	
	
// ----------------------
	
	/*
	public int sum(int a, int b){ 
		return a+b;
	}
	public int sum(int a, int b, int c){ 
		return a+b+c;
	}
	public int sum(int a, int b, int c, int d){ 
		return a+b+c+d;
	}
	*/
	
} // VarArgs : CLASS
