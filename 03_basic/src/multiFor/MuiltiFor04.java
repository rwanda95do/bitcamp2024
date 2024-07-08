package multiFor;

public class MuiltiFor04 {
	public static void main(String[] args) {
		for(int j=0; j<=6;j+=3) {
			for(int i =1; i<=9; i++) {			
				for(int dan=2; dan<=4; dan++) {
					if(dan+j <10) {
						System.out.print(dan+j + " * " + i + " = " + ((dan+j)*i) +"\t");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
