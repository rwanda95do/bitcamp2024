package thread;


// 오버라이드 :: 자식 Exception을 걸면 부모도 같이 Exception을 걸어야한다.
	// Runnable은 내가 만든 부모가 아닌데 어떻게 걸려고?? 
	// 그래서 Try~catch를 사용하는 것이다

class JoinTest implements Runnable{

	@Override
	public void run() { //Call-Back Method : 운영체제에 의해 불러지는 메소드 
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);  // 처리 단위 : 1/1000초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // FOR 
	} // run()
	
	
}

// ----------------------------------

public class JoinMain {

	public static void main(String[] args) {
		JoinTest joinTest = new JoinTest();
		
		Thread t = new Thread(joinTest);  // 스레드 생성
		
		System.out.println("스레드 시작");
		t.start();
		// 스레드 파괴
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		
	}
	
}


// main()이 끝나도 스레드는 종료되지 않는다. 
	// main()이 끝나도 백그라운드에서 스레드는 돌아간다.






