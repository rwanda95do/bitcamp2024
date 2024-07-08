package while_;

public class While01 {
	public static void main(String[] args) {
		int i =0;
		while(i<10) {
			System.out.print(++i + " ");
		}
		
		System.out.println();
		
		int j =1;
		while(j<=10) {
			System.out.print(j++ + " ");
		}
		
		System.out.println();
		
		int u =1;
		while(true) {
			System.out.print(u + " ");
			u++;
			if(u>10) {break;}
		}
		
		System.out.println();
		char ch = 'A';
		while(ch<='Z') {
			System.out.print(ch + " ");
			ch++;
		}
	}
}
