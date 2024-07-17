package interface_Compute;

import java.util.Scanner;

public class Mul implements Compute{
	private int x, y;
	
	public Mul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("x : ");
		x = scan.nextInt();
		System.out.println("y : ");
		y = scan.nextInt();
	}
	
	@Override
	public void execute() {
		System.out.println(x + " * " + y + " = " + (x*y));
	}

}
