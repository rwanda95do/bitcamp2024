package operator;

public class Operator04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1+=10)<0 &&(num2+=10)>0);
		System.out.println("&& result : " + result);
		System.out.println("num1 : " + num1 + " num2 : " + num2 );
		
		result = ((num1+=10)<0 || (num2+=10)>0);
		System.out.println("|| result : " + result);
		System.out.println("num1 : " + num1 + " num2 : " + num2 );
		
		result = ((num1+=10)<0 &(num2+=10)>0);
		System.out.println("& result : " + result);
		System.out.println("num1 : " + num1 + " num2 : " + num2 );
		
		result = ((num1+=10)<0 | (num2+=10)>0);
		System.out.println("| result : " + result);
		System.out.println("num1 : " + num1 + " num2 : " + num2 );
	}

}