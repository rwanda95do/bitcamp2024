package class__;

class StaticTest {
	int a;  // 필드  (특징)이미 초기화가 되어있다.  NEW를 이용해서 생서 -> 인스턴스 변수
	static int b; // 필드 (특징)초기화되어있다. -> 클래스변수


	static { // 스태틱 초기화
		System.out.println("스태틱 초기화, JVM이 시작하자마자 제일 먼저 작동");
	}
	public StaticTest() {
		System.out.println("default 생성자");
		this.a = 7;
		
	}
	
	public void calc() {
		a++; b++;
	}
	public void disp() {
		System.out.println("a = "+this.a+"\tb = " + StaticTest.b);
	}
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = "+this.a+"\tb = " + StaticTest.b);
		// staitc메소드엣는 static변수만 사용 가능(=this.을 사용할 수 없음) -> 메모리쪽 관련인듯...
	}
}

public class StaticMain {
	public static void main(String[] args) {
		//System.out.println("a : " + new StaticTest().a);
		//System.out.println("b  : " + StaticTest.b);
		
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		
		// static을 부르고 싶을때 
		StaticTest.output(); //클래스명.메소드
		aa.output();  //객체명.메소드
		
		
	}
}
