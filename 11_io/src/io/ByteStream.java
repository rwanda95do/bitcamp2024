package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException {
	
		//FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		// read() : int 입니다.!! 한글자씩 int로 가져와요. 그러다없으면.. -1
		int data;
		while( (data=bis.read()) != -1){
			System.out.print((char)data); 
				// 출력 결과 
				// 13 : CR (\r),  10 :  LF (\n)
		}
		System.out.println();
		bis.close();
		
		
	}
}
