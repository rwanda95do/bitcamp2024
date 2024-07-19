package collection;

import java.util.LinkedList;
import static java.lang.System.out;


public class LinkedListMain {
	public static void main(String[] args) {
		
		String[] item = {"소나타","랙스톤","재규어"};
		
		LinkedList<String> q = new LinkedList<String>();
		
		// offer() : 넣는다
		for(String n : item) {
			q.offer(n);
		}
		
		// size() : 크기
		out.println("q의 크기 :" + q.size() + "\n");
		
		String data = "";
		// poll() : 뺀다
		while((data=q.poll()) != null) {
			out.println(data + "삭제");
			out.println("q의 크기: " + q.size()+"\n");
		}
	}
}
