package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) throws IOException {
		//DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("result.txt"));
		
		
		// IOException (부모) -> FileNotFoundException (자식)
		FileOutputStream fos = new FileOutputStream("result.txt");   // FileNotFoundException 발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");  //IOException 발생
		dos.writeInt(25);
		dos.writeDouble(185.3);
		
		dos.close();
		
		
	// 데이터 읽기
		// 파일에 들어간 순서대로 나온다 : 홍길동 -> 25 -> 185.3
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		dis.close();
	}
}
