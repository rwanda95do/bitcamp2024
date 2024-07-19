package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet
public class SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이");  // 중복 허용X, 순서X
		set.add("기린");
		set.add("코끼리");
	
	// Iterator를 set에 붙여서 사용하는중	
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
	
}
