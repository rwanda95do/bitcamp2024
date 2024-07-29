package lambda;

class Calculator{
	
	public static String staticMethod(int x, int y) {
		return x +"+"+ y +"="+ (x+y);
	}
	
	public String non_staticMethod(int x, int y) {
		return x +"*"+ y +"="+ (x*y);
	}
}



public class LambdaMain05 {

	public static void main(String[] args) {

		Person04 person04 = new Person04();
		
		person04.execute((x,y)->Calculator.staticMethod(x, y));
		person04.execute(Calculator::staticMethod);
		
		Calculator calculator = new Calculator();
		person04.execute((x,y)->calculator.non_staticMethod(x, y));
		person04.execute(calculator::non_staticMethod);
	}

}
