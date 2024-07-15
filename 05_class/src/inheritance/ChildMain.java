package inheritance;

public class ChildMain extends Super{
	private String name;
	protected int age;
	
// 생성자 -----------------------------
	public ChildMain() {System.out.println("ChildMain() 기본생성자");}
	public ChildMain(String name, int age, double weight, double height) {
		super(weight, height);
				
		System.out.println("ChildMain(name, age, weight, height)");

		this.name = name; 
		this.age = age;
	}
// 메소드 ------------------------------	
	public void disp() { // disp() 오버라이드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		//disp();  //이건 오류남... 부모의disp()를 부르는게 아니라 childMain의 disp()를 부르기 때문
		super.disp(); 
	}
//------------------------------------------------------------------	
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25, 83.5, 168);
		aa.disp();	
		
		System.out.println();
		Super bb = new ChildMain("홍길동", 25, 83.5, 168);
		bb.disp();
	}
}
