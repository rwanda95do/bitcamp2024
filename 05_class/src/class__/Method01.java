package class__;


public class Method01 {
	public static void main(String[] args) {
		// static 메소드 호출 : 클래스명.메소드명
		Method01.display();
		display();
		
		// non-static 메소두 : new
		Method01 m1 = new Method01();
		m1.output();
		new Method01().output();
		
		m1.display();
		
	} // main
	
	public static void display() {
		System.out.println("static method : public static void display()");
	} // display()
	
	public void output() {
		System.out.println("non-static method : public void output()");
	}// output()
	
}
