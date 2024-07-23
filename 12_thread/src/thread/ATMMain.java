package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATM implements Runnable {   // 인터페이스 : 스레드 만들기
	
	private long depositeMoney = 100000;  // 잔액
	private long balance;  // 찾고자하는 금액
	
	@Override
	public synchronized void run() {  // synchronized :LCOK걸림. 스레드지만... 한번에 하나씩만 들어오세요 
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요   " +Thread.currentThread().getName() + " 고객님");
			
			// IO를 배웠으니 Scanner을 쓰지 않고!
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			System.out.print("찾고자 하는 금액 입력 : ");
			try {
				balance = Long.parseLong(br.readLine());    // br.readLine() : String타입
			} catch (IOException e) {
				e.printStackTrace();
			}  
			
			withDraw();
		}  // FOR
		
	} //run()
	
	public void withDraw() {
		//2. 만원 단위로 입력하세요
		if(balance%10000 != 0) {
			System.out.println("만원 단위로 입력하세요");
		} else{
			//1. 잔액은 ~~입니다.
			if(balance <= depositeMoney) {
				depositeMoney = depositeMoney-balance;
			} else {
				//3. 잔액이 부족합니다.
				System.out.println("잔액이 부족합니다.");
			}
			System.out.println("잔액 : " + depositeMoney);
		}
		
	} // withDraw()
	
} // CALSS : ATM

// -------------------------------

public class ATMMain {	
	
	public static void main(String[] args) {
		// 스레드 생성
		//Thread mom = new Thread(this);  // Static은 this값이 없고, 스레드가 없으니 this가 스레드로 작동할 수가 없다
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마");  // setname("엄마");
		Thread son = new Thread(atm);
		son.setName("아들");
		
		mom.start();
		son.start();
	}
}
