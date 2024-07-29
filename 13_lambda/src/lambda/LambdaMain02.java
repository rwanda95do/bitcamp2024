package lambda;

class Person02{
	public void execute(Workable workable) {
		workable.work();
	}
}


public class LambdaMain02 {

	public static void main(String[] args) {
		Person02 person02 = new Person02();
		person02.execute(()->{
			System.out.println("안녕하세요");}
		);
		
		person02.execute(()->{
			System.out.println("반갑습니다");}
		);
	
	
	}

}
