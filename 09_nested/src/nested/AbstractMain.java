package nested;

public class AbstractMain {
	public static void main(String[] args) {
		
		AbstractTest abstractTest = new AbstractTest() { // 익명 Inner 클래스
			@Override
			public void setName(String name) {}
		};
		
	// implements InterA를 하지 않았따! -> 익명(키다리아저씨 소ㄴ환?!@_@)
		InterA in = new InterA() { 
			@Override
			public void aa() {}
			@Override
			public void bb() {}
		};
		
		AbstractExam abstractExam = new AbstractExam() {
			// 추상 메소드가 없으니까 개발자가 원하는 메소드만 Override
		};
		
		
	} // main
}


// 메소드의 구현을 처리하는 건 CLASS 뿐 !! 
