package com.apple;

import com.zoo.Zoo;

public class Apple {
	public static void main(String[] args) {
		System.out.println("빨강사과");
		
		Zoo zoo = new Zoo();
		zoo.tiger();
		// 다른 패키지의
		// protected, default, private 를 사용한 메소드를 사용할 수 없음
	}
}
