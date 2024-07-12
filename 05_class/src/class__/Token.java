package class__;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 : " + st.countTokens()); //공백도 잡힘...
		
		while(st.hasMoreTokens()) { //hasMoreTokens() : 토큰이 있으면 T, 없으면 F
			System.out.println(st.nextToken());  //st.nextToken() : 토큰을 꺼내고 다음으로 이동 
		}
		System.out.println("--------------------------");
		
		String[] ar = str.split(",");  // split(str) :str기준으로 잘라서 배열로 가져옴
		for(String data : ar) {
			System.out.println(data);
		}
	}
}
