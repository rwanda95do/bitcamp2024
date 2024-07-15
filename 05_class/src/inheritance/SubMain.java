package inheritance;


public class SubMain extends Super {
	private String name;
	protected int age;
	
	public SubMain() {System.out.println("CLASS SubMain() : 기본생성자");}
	public SubMain(String name, int age, double weight, double height) {
		// 부모 생성자 호출 (단, 부르는 쪽이 생성자여야하고, 제일 첫 줄에 적어야한다.)
		super(weight, height);
		
		System.out.println("CLASS SubMain(String, int, double, double)");

		// 내 클래스 참조값 : this.
		this.name = name; 
		this.age = age;
		
		// 부모 클래스 참조값 : super.
		super.weight = weight;
		super.height = height;
		
	}
	
	public void oputput() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		//System.out.println("몸무게 : " + weight);
		//System.out.println("키 : " + height);
		disp();  // 순서 : 나 -> 부모 : 지금은 부모 클래스의 disp()호출
	}
	
// -----------------------------------------------------------------	
	public static void main(String[] args) {
		
		
		// 자식 클래스를 NEW해서 생성자를 만들면, 자동으로 부모클래스 기본 생성자까지 메모리에 잡아낸다
		// 아무것도 없을때 기본 생성자가 자동으로 생길 뿐 -> 상속은 기본생성자를 무조껀 필수로 만들면 좋다
		//new SubMain();
		SubMain aa = new SubMain("홍길동", 25, 83.5, 168);
		aa.oputput();
		
		System.out.println();
		aa.disp();
		
		System.out.println();
		Super bb = new SubMain("코난", 13, 35.8, 130.1);
		//bb.output();  // 오류난다... 
		bb.disp();
	
	} // main()


}
