package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

// 시간 형식 지정
// java.util.Date;
// java.text.SimpleDateFormat

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		System.out.println("오늘날자 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일");
		System.out.println(sdf.format(date));		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("kk:mm:ss");
		System.out.println(sdf2.format(date));		
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf3.format(date));	
		
		/*
		//생일입력
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
		System.out.println("생일 날짜 입력 (예시: 20240717) : ");
		String birth = scan.next(); //string 타입으로 입력 받았다
		
		Date birth_date = input.parse(birth);  // String => Date 형번환 : .Date.parse(String)
		System.out.println("내생일 : " + sdf.format(birth_date));
		*/
		
		// Calendar(추상클래스) : 시스템의 날짜와 시간을 기준으로 생성 
		//Calendar cal = new GregorianCalendar();  // 서브 클래스를 이용해서 생성
		Calendar cal = Calendar.getInstance(); // 메소드를 이용해서 생성		
		int year = cal.get(Calendar.YEAR); // 년
		System.out.println(year);
		int month = cal.get(Calendar.MONTH)+1; // 월 : 1월=0,...12월=11 부터 시작
		System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일" + day);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일 : 일=1, 월=2.... 토=7
		System.out.println(week);
		String week_of_date = "";
		switch(week) {
			case 1: week_of_date = "일"; break;
			case 2: week_of_date = "월"; break;
			case 3: week_of_date = "화"; break;
			case 4: week_of_date = "수"; break;
			case 5: week_of_date = "목"; break;
			case 6: week_of_date = "금"; break;
			case 7: week_of_date = "토"; break;
			default: break;
		}
		System.out.println(week_of_date);
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		System.out.println(hour);
		int minute = cal.get(Calendar.MINUTE); 
		System.out.println(minute);
		int second = cal.get(Calendar.SECOND); 
		System.out.println(second);
		
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + week_of_date + "요일 "
							+ hour + "시" + minute + "분" + second + "초");
		
		
		
	}
}
