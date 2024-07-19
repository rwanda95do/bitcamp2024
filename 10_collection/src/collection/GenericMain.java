package collection;

public class GenericMain<T> {
	
	private T a;
	
	public void setA(T a) {this.a = a;}
	
	public T getA() {return a;}
	
	public static void main(String[] args) {
		GenericMain<String> aa = new GenericMain<String>();  // 생성할때 타입을 적어준다
		aa.setA("홍길동");
		System.out.println(aa.getA());
		
		GenericMain<Integer> bb = new GenericMain<>();  // 타입!!!! int가 아님 절대!
		bb.setA(25);
		System.out.println(bb.getA());
		
		
	}
}
