package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



// 파일/사진 다운로드 할대 사용하는 코드 -> 한번에 내려 받을 때

public class ByteStream2 {
	public static void main(String[] args) throws IOException {
		
		// 파일명이 아니라 파일 객체로 잡아주기
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
	
		// 파일 크기 구하기 
		int size = (int) file.length();
		
		// 파일의 크기 만큼 byte[] 생성 : 왜? 한번에 읽어버릴꺼니까
		byte[] b = new byte[size];
		
		// 파일 내용을 한번에 읽기
		bis.read(b, 0, size);
		
		// for하기 귀찮으니까 byte[] -> String으로 해버립시다
		System.out.println(new String(b));
		
	}
}
