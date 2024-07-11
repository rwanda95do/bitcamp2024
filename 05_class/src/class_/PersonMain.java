package class_;


class Person {
	private String name;
	private int age;
	
	//name
	public void setName(String n){ // 구현
		name = n;
	}
	public String getName(){
		return name;
	}
	
	//age
	public void setAge(int a) {
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void setData(String n, int a){
		name = n;
		age = a;
	}
	public void setData(){}
	
} // Person CALSS


public class PersonMain {
	public static void main(String[] args) {
		Person aa; // 객체
		aa = new Person(); // 생성
		
		System.out.println(aa);
		aa.setName("홍길동"); // 메소드 호출
		aa.setAge(20);
		System.out.println(aa.getName() + aa.getAge());
		

		Person bb; // 객체
		bb = new Person(); // 생성
		
		System.out.println(bb);
		bb.setName("코난"); // 메소드 호출
		bb.setAge(14);
		System.out.println(bb.getName() + bb.getAge());
		
		Person cc; // 객체
		cc = new Person(); // 생성
		System.out.println(cc);
		cc.setData("또치", 23);
		System.out.println(cc.getName() + cc.getAge());

	}
} //PersonMain CLASS (MAIN)

