package nested;

public class Outer {  

	private String name;
	
	public void output() {
		// age 접근 불가능 -> new Inner() 사용해야함
		System.out.println("이름 : " + name + "나이" + new Inner().age);	
		System.out.println("이름 : " + this.name + "나이" + new Inner().age);	
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("이름 : " + name + "나이" + age);
			System.out.println("이름 : " + Outer.this.name + "나이" + this.age);	// Outer.this.name : Outer소속의 this.name입니다.
		}
	} // CLASS Inner
	
	public static void main(String[] args) {
	// Outer 클래스 생성
		Outer outer = new Outer();
		outer.name= "홍길동";
		outer.output();
		
		System.out.println();
		
	// Inner 클래스 생성
		Outer.Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();
		
		System.out.println();
		
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		System.out.println();

		Outer.Inner inner3 = new Outer().new Inner();
		//inner3.name = "코난";  // 안되는 이유 : static 공간에서 이기 떄문에?
		
		inner3.age = 45;
		inner3.disp();
	}
	
	
} // CALSS : Outer
