package basic;

public class variable2 {

	int a; //필드, 이미 0으로 초기화 되어있음
	
	static int b; // static사용은 메모리를 많이 잡아 먹기때문에 최소롤 사용하는 걸 추천
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 100;  // 지역변수(local variable)
		System.out.println("지역변수 a :" + a);
	
		System.out.println("필드 a : " + new variable2().a );
		System.out.println("필드 static b : " + b);
	}

}
