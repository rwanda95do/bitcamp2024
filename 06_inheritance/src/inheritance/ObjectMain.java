package inheritance;


class Test{  //class Test (extends Object)
	
	@Override
	public String toString() {
		return getClass() + "개바부";  // Objest클래싀으 getClass() : 클래스명 표시
	}
	
}


public class ObjectMain {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString()); // Object클래스의 toString() : 클래스 주소  16진수
		System.out.println(test.hashCode()); // 클래스 주소를 10진수로
		
		String str = "apple";  // literal -> heap영역 
		System.out.println(str);
		System.out.println(str.toString()); // class String extends Object{@override toString()}
		System.out.println(str.hashCode());// 문자열은 무한대여서 10진수 표현을 할 수 없다. -> 믿을 수 없는 숫자를 내놓음.. 
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println(aa==bb);  // 주소비교
		System.out.println(aa.equals(bb));  // 값 비교
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println(cc==dd);  // 주소비교
		System.out.println(cc.equals(dd));  // 주소비교 -> Object
		

		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println(ee==ff);  // 주소비교
		System.out.println(ee.equals(ff));  // 값 비교
		
		
	}

}
