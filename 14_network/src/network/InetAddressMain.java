package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) throws UnknownHostException {
	// InetAddress : 주소를 얻어오는 거
		// 특징 : 기본생성자가 없다. (인터페이스X, 추상클래스X) -> 메소드를 통해서 생성
		InetAddress naver = InetAddress.getByName("www.naver.com");
		
		System.out.println(naver);
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
		
		System.out.println("---------------------------");
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local);
		System.out.println(local.getLocalHost());
		System.out.println(local.getLoopbackAddress());
		
		System.out.println("---------------------------");
	// .getAllByName : ip하나당 배열 하나씩 	
		InetAddress[] ar = InetAddress.getAllByName("www.naver.com");
		for (InetAddress data : ar) {
			System.out.println(data.getHostAddress());
		}
	}

}


// 누가 들어왔는지 IP 추적 가능 
