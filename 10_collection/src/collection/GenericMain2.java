package collection;

public class GenericMain2<T> {
	
	private T a;
	
	public GenericMain2(T a) {
		this.a = a;
	}

	public void setA(T a) {this.a = a;}
	
	public T getA() {return a;}
	
	
	public static void main(String[] args) {
		//GenericMain2<?> aa = new GenericMain2<String>(); // String으로 넣는데 안에서는 Object로 해버린다
		//aa.setA("홍길동"); // ERROR : <?>를 해버리면, 반드시 데이터는 Setter가 아니라 생성자를 통해서 넣어야한다.
			// 그럼 위에처럼 생성하는 것부터가 안되는거였음.. 
	
		GenericMain2<?> aa = new GenericMain2<String>("홍길동");
		System.out.println(aa.getA());  //Object로 들어오니까
		String name = (String)aa.getA();  // 형변환 시켜줘야한다.
		System.out.println(name);
		
		
		GenericMain2<?> bb = new GenericMain2<Integer>(25);
		int age = (int) bb.getA();
		System.out.println(age);
		
		
		
		
	} // main

 } //CLASS : GenericMain2
