package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws MalformedURLException, IOException {
	// URL : MalformedURLException
		URL url = new URL("https://www.naver.com/index.html");
		System.out.println("프로토콜: " + url.getProtocol());
		System.out.println("호스트: " + url.getHost());
		System.out.println("포트 : " + url.getPort());  // 내가 입력한 포트
		System.out.println("기본 포트: " + url.getDefaultPort()); // 기본포트
		System.out.println("파일: " + url.getFile());
		System.out.println(": " + url.getAuthority());
		System.out.println("getPath: " + url.getPath());
		System.out.println("getQuery: " + url.getQuery());
		System.out.println("getRef: " + url.getRef());
		System.out.println("getUserInfo: " + url.getUserInfo());
		
		
	// IO 생성 : IOException
		// 버퍼 크기만큼만 보여줌
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
