package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		System.out.println("vector 크기 : " + v.size());
		System.out.println("vector 용량 : " + v.capacity()); // 기본 용량 10, 항목이 들어갈 공간이 없으면 10개씩 자동 증가

		
		System.out.println("항목추가");
	
		for(int i=1; i<=10; i++) {
			v.add(i+" ");
			System.out.print(v.get(i-1) + " "); // index 0부터 시작
		}
		System.out.println();
		System.out.println("vector 크기 : " + v.size());
		System.out.println("vector 용량 : " + v.capacity()); // 기본 용량 10, 항목이 들어갈 공간이 없으면 10개씩 자동 증가
		
		
		
		System.out.println();
		System.out.println("항목 1개 추가");
		v.addElement(5+" ");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		System.out.println("vector 크기 : " + v.size());
		System.out.println("vector 용량 : " + v.capacity()); // 기본 용량 10, 항목이 들어갈 공간이 없으면 10개씩 자동 증가
		
		
		System.out.println();
		System.out.println("항목 5를 삭제");
		v.remove(5);  // 인덱스가 5번인 값6이 사라짐..
		v.remove(5+" "); // 앞쪽에 있는게 사라짐
		System.out.println(v); // 객체값주소를 toString으로 바꿔놈
	
	// Iterator 사용 	
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
