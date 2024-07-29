package lambda;

@FunctionalInterface
interface Create1{
	public Person create(String name);
}

@FunctionalInterface
interface Create2{
	public Person create(String name, int age);
}

class Person{
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person(String name) 생성자");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 생성자");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}


class PersonTest{
	public Person getPerson01(Create1 create1) {
		String name ="none";
		Person person = new Person(name);
		return person;
	} 
	
	public Person getPerson02(Create2 create2) {
		String name ="홍길동";
		int age = 23;
		Person person = new Person(name, age);
		return person;
	} 
}

public class LambdaMain07 {

	public static void main(String[] args) {
		PersonTest personTest = new PersonTest();
		
		Person one = personTest.getPerson01(Person::new);
		System.out.println("이름 : " + one.getName());
		System.out.println("나이 : " + one.getAge());
		System.out.println();
		
		Person two = personTest.getPerson02(Person::new);
		System.out.println("이름 : " + two.getName());
		System.out.println("나이 : " + two.getAge());
		System.out.println();
		
	}

}
