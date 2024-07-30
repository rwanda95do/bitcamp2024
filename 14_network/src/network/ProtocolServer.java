package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	
	public ProtocolServer() {
		try {
			serverSocket  = new ServerSocket(9500); // 9500번 포트 기다리는 중...
			System.out.println("서버 준비 완료!!! ");
			
			socket = serverSocket.accept(); // 클라이언트를 낚아채서 소켓을 생성한다
			
			// IO
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter((new OutputStreamWriter(socket.getOutputStream())));
			
		} catch (IOException e) {
			System.out.println("클라이언트와의 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		String line;
		try {
			while(true) {
				// 클라이언트 -> 서버
				line = br.readLine();
				
				
				
				// 서버 -> 클라이언트
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)){ // 100:입장
					bw.write(ar[1] + "님 입장하였습니다.\n");
					bw.flush();
				}else if(ar[0].equals(Protocol.EXIT)){ // 300:퇴장
					bw.write(ar[1] + "님 퇴장하였습니다.\n");
					bw.flush();
					
					bw.close();
					br.close();
					socket.close();
					
					System.exit(0);
				}else if(ar[0].equals(Protocol.SEND_MEDDAGE)) {  // 200:메시지
					bw.write("[" + ar[1] + "] " + ar[2] + "\n");
					bw.flush();
				}				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	} // 기본 생성자 ProtocolServer
	
	
	public static void main(String[] args) {
		new ProtocolServer();
	}
}
