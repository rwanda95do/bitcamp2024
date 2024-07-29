package lambda;

class Person03{
	public void execute(InterA interA) {
		interA.disp("홍길동", 25);
	}
	
	public void execute(InterB interB) {
		interB.output("안녕하세요 홍길동입니다.");
	}
}

public class LambdaMai03 {

	public static void main(String[] args) {
		Person03 person03 = new Person03();
		
		person03.execute((name, age)->{
			System.out.println(name + "입니다.");
			System.out.println(age + "입니다");
		});
		
		// 매개변수가 1개일 경우에는 () 생략 가능
		person03.execute(data->System.out.println(data));
	}

}
