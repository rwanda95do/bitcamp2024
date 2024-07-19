package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// puT() : 넣는다
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");  // Value 중복허용
		map.put("book301", "쟈스민");
		map.put("book101", "엄지공주"); // Key 중복허용 -> 이전꺼 덮어버림
		map.put("book401", "덕혜옹주");
		
		// get() : 꺼낸다
		System.out.println(map.get("book101"));
		System.out.println(map.get("book301"));
		System.out.println(map.get("book501"));  // 없으면 null -> 항목이 있는지 없는지 확인이 가능한 방버비 될 수가 있다.
				// 주의 indexOf()는 없으면 -1
		
		
		// .entrySet()
		//.Entry<K,V>
		for(Map.Entry<String, String> data : map.entrySet()) {
			String key = data.getKey();
			String value =data.getValue();
			
			System.out.println(key + "  " + value);
			
		}
	}
}
