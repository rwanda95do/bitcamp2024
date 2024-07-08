package multiFor;

public class MuiltiFor02 {
	public static void main(String[] args) {
		//구구단
		for(int dan =2; dan<=9; dan++) {
			System.out.println("구구단 : " + dan + "단");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
	}
}
