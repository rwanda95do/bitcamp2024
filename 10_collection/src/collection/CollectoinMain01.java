package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 추상 클래스 new XXXX
	// 자식을 이용한다. 
	// 생성자를 이용한다.
// 인터페이스 new XXXX
	// 1. implements를 이용한다 => 모든 추상 메소드를 오버라이드 해줘야함....
	// 2. 대신 오버라이드 해주는 클래스를 이용한다.	
	// 3. 메소드
	// 4. 

//public class CollectoinMain01 implements Collection<E>{  -> 오버라이드 할 게 너무 많아... 
public class CollectoinMain01 {
	
	@SuppressWarnings("all")		// 어노테이션, 모든 경고를 내보내지 말라고 윽박지르는중..ㅋㅋ => 제너릭으로 쓰는건 CM02번
	public static void main(String[] args) {
	
		Collection coll = new ArrayList(); // 2번 방법
		
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");	// 중복허용
		coll.add(25);
		coll.add(24.7);
		coll.add("기린");
		coll.add("코끼리");
		
		
		Iterator it = coll.iterator();  // 3번 방법		
		
		//.hasNext() : 현재 위치에 항목이 있으면 T, 없으면 F
		// .next() :  현재 위치의 항목을 꺼내서 버퍼에 기억을 시키고, 다음 항목으로 이동한다.
		while(it.hasNext()) {
			System.out.println(it.next()); // 화면에 찍히는건 버퍼에 저장되어 있는 값이 찍히는것
		}
	
	}
}
