package while_;

public class Dowhile {
	public static void main(String[] args) {
		char ch = 'A';
		int count = 0;
		do {
			System.out.print(ch + " ");
			ch++; count++;
			if((int)count % 7==0){System.out.println();}
		}while(ch <='Z');
		
	}
}
