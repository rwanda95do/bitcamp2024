package collection;

import java.util.ArrayList;

public class CollectoinMain02 {
	public static void main(String[] args) {
		//<String> : 제너릭
		ArrayList<String> coll = new ArrayList<String>();	
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");	// 중복허용
		// coll.add(25);
		// coll.add(24.7);
		coll.add("기린");
		coll.add("코끼리");
		
		for(int i=0; i<coll.size(); i++) {
			System.out.println(coll.get(i));
		}
		
		for(String data : coll) {
			System.out.println(data);
		}
	}
}
