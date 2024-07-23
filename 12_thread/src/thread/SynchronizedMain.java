package thread;


class Synchronized extends Thread{   // 클래스 : 스레드 만들기

	private static int count=0; // 공동
	
	@Override
	public void run() {
		
		// synchronized (this)가 되면 aa,bb,cc는 각자 만들어진 애기때문에 난장판 됨..  -> ( )안에는 공통점을 적어야한다.
		synchronized (Synchronized.class) {  // == 하나의 스레드만 통과시켜라
			for (int i=1; i<=5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : "+ count); // 현재 스레드가 누군지 알려줌
				// Thread.currentThread() :: Thread[cc,5,main]  : 5 -> 우선순위			
			}			
		} // synchronized
	}
}

// -----------------------------------------

public class SynchronizedMain {

	public static void main(String[] args) {
		Synchronized aa = new Synchronized();
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();

		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		
		// 우선순위 : 1~10까지 부여 (10이 가능 우선순위 높음)
			// 근데... 숫자를 넣으니...  의미가 없네...?
			// 3개 이상으면 숫자 써야함...ㅋ 
		aa.setPriority(Thread.MIN_PRIORITY);//aa.setPriority(1);
		bb.setPriority(Thread.MAX_PRIORITY);//bb.setPriority(10);
		cc.setPriority(Thread.NORM_PRIORITY);//cc.setPriority(5);
		
		
		
		aa.start();
		bb.start();
		cc.start();
	}
}
