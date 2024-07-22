package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable{

	public Clock() {
		//this => CLock => Clock is Frame => Frame
		this.setFont(new Font("Consolas", Font.BOLD, 25));// this.setFont(new Font("글꼴"));
		setBackground(new Color(204, 255, 255));// setBackground(new Color(빨강, 초록, 파랑));
		setForeground(new Color(100,200,130));
		
		
		//setSize(300,400);
		setBounds(500,400,300,400);
		setVisible(true);
		
		
		// 스레드 생성
		Thread t = new Thread(this);  // 요기 this가 신기하네 new Clock()하면 안됨 
		//스레드 시작
		t.start();
		
		
	//이벤트리스너 :: X버튼 종료하기
		// Interface : 2.모든 추상 메소드를 오버라이드 해주는 클래스 이용하기 -> new WindowAdapter
				// 추상 클래스인데.. 추상 메소드가 없어...
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);  // 강제종료
			}
		});
		
	}
	
// ----------------------

	@Override
	public void run() {
	
		while(true) {
			repaint();
			
			// 그려주는게 빠르는까 요기서 좀 재워버려
			try {
				Thread.sleep(1000);  // sleep은 static으로 선언되어있음 ->Thread클래스로 바로 오기 때문에
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	// Call-Back 이라서 run()에서 직접 호출할 수가 없다 -> repaint()
	// Frame에 그려준다! 
	@Override
	public void paint(Graphics g) {
		//SimpleDateFormat
		//Calendar
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		
		g.drawString(sdf.format(date), 90, 100);

	}
	
// ------------------------

	
	public static void main(String[] args) {
		new Clock();   // Frame 생성되고, paint()호출
	}
	
}
