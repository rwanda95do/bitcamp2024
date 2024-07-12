package class__;

public class Constructor01 {
	
	private String name;
	private int age;
	
	
	// default constructor
	public Constructor01() {
		System.out.println("기본 생성자");
		System.out.println(this);
	}
	
	// 생성자 Constructor01(String name)
	public Constructor01(String name) {
		System.out.println("Constructor01(String name) 생성자");
		this.name = name;
	}
	
	// 생성자 Constructor01(int age)
		public Constructor01(int age) {
			// OVERLOAD된 생성자 호출 -> 반드시 첫번째 줄에 써야한다. 
			this("코난");
			System.out.println("Constructor01(int age) 생성자");
			this.age = age;
		}
	
	
	
	public static void main(String[] args) {
		Constructor01 aa = new Constructor01();
		System.out.println(aa);
		
		System.out.println();
		
		Constructor01 bb = new Constructor01("홍길동");
		System.out.println(bb.name + ", " + bb.age);
		
		System.out.println();
		Constructor01 cc = new Constructor01(25);
		System.out.println(cc.name + ", " + cc.age);
	} // main
}
