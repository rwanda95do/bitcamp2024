package multiFor;

public class MuiltiFor03 {
	public static void main(String[] args) {
		for(int i =1; i<=9; i++) {			
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + " * " + i + " = " + (dan*i) +"\t");
			}
			System.out.println();
		}
		
	}
}
