package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ProtocolClient {
	
	Socket socket; 
	BufferedReader br;
	BufferedWriter bw;
	Scanner scan;
	
	public ProtocolClient() {
		try {
			socket = new Socket("localhost", 9500); //new Socket(ip, port)
			
		// IO
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter((new OutputStreamWriter(socket.getOutputStream())));
			
			scan = new Scanner(System.in);
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.(전화번호틀림)");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와의 연결이 안되었습니다.(뚜뚜뚜ㄸ)");
			e.printStackTrace();
			System.exit(0);
		} 
		
		// ------------------
		String message, line;
		
		try {
			while(true) {
			// 클라이언트 ->서버
				System.out.println("[입장]  100:대화명 이라고 입력하세요");
				System.out.println("[퇴장] 200:대화명 이라고 입력하세요");
				System.out.println("[메시지]  300:대화명:메시지 이라고 입력하세요 \n");
				
				message = scan.nextLine();
				
				bw.write(message+"\n");  // 서버로 메세지 보내기
				bw.flush(); // 버퍼 비우기 -> 그다음 데이터를 보내기 위해서
				
				
			// 서버 -> 클라이언트
				line = br.readLine();
				System.out.println(line);
				
				// 종료 :: "200:대화명" -> :을 이용해서 분리 
				String[] ar = message.split(":");
				if(ar[0].equals(Protocol.EXIT)) { //if(ar[0].equals("200")) {
					br.close();
					bw.close();
					socket.close();
					
					System.out.println("클라이언트 종료");
					System.exit(0);
				}
			} // while
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	} // 기본 생성자 ProtocolClient()
	
	
// ------------------------------------------------	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}
