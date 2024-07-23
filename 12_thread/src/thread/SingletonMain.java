package thread;

class Singleton{
	private int num = 3;

	// Singleton객체의 주소를 담을 static변수 생성 -> static이라서 한번만 생성
	private static Singleton instance;  
	
	public static Singleton getInstance() {
		if(instance == null) {
			// 스레드로 들어온다면...
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public void calc() {
		num++;
	}
	public void disp() {
		System.out.println("num : " + num);
	}
}

// -------------------------------

public class SingletonMain {
	public static void main(String[] args) {
		
		Singleton aa = Singleton.getInstance();
		aa.calc();
		aa.disp();
		System.out.println();
		
		Singleton bb = Singleton.getInstance();
		bb.calc();
		bb.disp();
		System.out.println();
		
		/*
		// 싱글톤으로 작성할때는 new를 하면 안됨. 
		Singleton aa = new Singleton();
		aa.calc();
		aa.disp();
		System.out.println();
		
		Singleton bb = new Singleton();
		bb.calc();
		bb.disp();
		System.out.println();
		
		Singleton cc = new Singleton();
		cc.calc();
		cc.disp();
		System.out.println();
		*/
		
	}
}
