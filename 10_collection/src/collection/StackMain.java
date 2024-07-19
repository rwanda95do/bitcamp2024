package collection;

import java.util.Stack;
import static java.lang.System.out;  // 말줄이기 설명할떄 이야기한 그건가..?


public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		// push() : 넣는다
		for(int i=0; i<groupA.length; i++) {stack.push(groupA[i]);}
		
		// isEmpty(): 비었니? 비었다(T), 안비었다(F)
		// pop() : 꺼낸다
		while(!stack.isEmpty()) {out.println(stack.pop());}

	}

}
