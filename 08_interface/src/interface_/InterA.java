package interface_;

public interface InterA {
	public static final String NAME = "홍길동"; //상수
	int age =25;
	
	public abstract void aa();
	public void bb();		// abstract 생략 가능
}


// 인터페이스틑 일반 변수를 쓸 수 없다. -> 인터페이스에 들어오는 것은 전부 상수이기 때문에 
// 근데 왜 오류가 안날까? int age =25;
// public static final이 생략가능하기 때문이다.
