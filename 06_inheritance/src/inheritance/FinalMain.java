package inheritance;

// enum
enum ColorEnum{
	RED, GREEM, BLUE // 순서대로 0, 1, 2 => 그냥 이름으로도 가능
}


class Final{
	public final String FRUIT1 = "사과";
	public final String FRUIT2;  // 필드 변수 값 넣어주려면 => 생성자

	// 상수 : public static final [타입] [대문자변수명] = "초기화";
	public static final String ANIMAL1 = "호랑이";	
	public static final String ANIMAL2;	
	
	public Final() {
		// FRUIT1= "딸기";  // 안됨 => 선언하면서 초기화 했으니까 
		FRUIT2="딸기";
		
		//static은 절대 생성자에서 초기화되지 않는다. => static의 구역으로 가서 초기화  
	}
	
	static { // static을 초기화 하는 공간
		ANIMAL2="기린";
	}
}

public class FinalMain {
	public static void main(String[] args) {
		final int AGE = 25;  //final 변수는 변경 불가
		System.out.println(AGE);

		// 자바는 초기값을 안주면 한번 더 기회를 준다. 
		final String NAME;
		NAME = "홍길동";
		System.out.println(NAME);
		
		System.out.println();
		
		// 필드
		Final f = new Final();
		System.out.println(f.FRUIT1);
		System.out.println(f.FRUIT2);
		
		System.out.println();
		
		//
		System.out.println(Final.ANIMAL1);
		System.out.println(Final.ANIMAL2);
		
		System.out.println();
		
		// enum
		System.out.println(ColorEnum.RED);
		System.out.println(ColorEnum.RED.ordinal()); // .ordinal( => 값을 보여줌
		for(ColorEnum data: ColorEnum.values()) {   //.values()
			System.out.println(data.ordinal() +" : "+ data);
		}
	}
}
