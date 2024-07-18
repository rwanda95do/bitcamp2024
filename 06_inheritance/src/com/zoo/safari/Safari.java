package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {
	public static void main(String[] args) {
		/*
		Zoo zoo = new Zoo();
		zoo.tiger();
		zoo.giraffe();
		zoo.elephant();
		zoo.lion();
		*/
		
		// 패키지가 다름 -> public 가능
		
		// 자식 클래스에서 protected를 사용하려면 
		// 반드시 자식으로 생성해서 사용해야 한다. -> 부모는 누구한테 상속해줬는지 모르니까 
		// 단순히 extends만 사용한다고 되는게 아니다 
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
	}
}
