package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 만들떄? 파일명이 없으면 만들어서 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		
		oos.writeObject(dto);  // dto를 파일로 보내버리기
		oos.close();
		
		// 읽을 때 파일명이 없으면 ERROR
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		// 읽어오기 원하는 형식이 PersonDTO니까 
		//Object ob = ois.readObject();
		PersonDTO dto2 = (PersonDTO)ois.readObject();  // 자식 = (자식)부모
		System.out.println(dto2.getName());
		System.out.println(dto2.getAge());
		System.out.println(dto2.getHeight());
		
		ois.close();
		
	}
}
