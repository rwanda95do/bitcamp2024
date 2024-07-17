package abstract_;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
[문제] 만년달력

[클래스]
CalendarEx
[필드]
필드는 원하는 것으로 직접 잡기 
[메소드]
생성자 : 년도, 월을 입력
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드를 찾아서 수행)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드를 찾아서 수행)
         display() -> 출력
         
[클래스]
CalendarMain         

[실행결과]
년도 입력 : 2024                        년도 입력 : 2000
월 입력 : 1                            월 입력 : 2

일   월   화   수   목   금   토          일   월   화   수   목   금   토
   1   2   3   4   5   6               1   2   3   4   5
7   8   9   10   11   12   13          6   7   8   9   10   11   12
14   15   16   17   18   19   20       13   14   15   16   17   18   19
21   22   23   24   25   26   27       20   21   22   23   24   25   26
28   29   30   31                      27   28   29
*/


public class CalendarMain {
// ----------------	
	 static int year, month;
	 int lastDay, firstDayOfWeek;
// ----------------	
	public CalendarMain() {}
	public CalendarMain(int year, int month) {
		this.year = year;
		this.month = month;
	}
// -------------------	
	public void calc() {
		Calendar calendar = Calendar.getInstance();
		
		// set()을 이용해서 컴퓨터가 가져오는 날짜의 값을 내가 고정시켜버림
		calendar.set(year, month,1);
		
		
		// 입력한 년/달의 마지막 일
		lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// 입력한 년/달의 1일의 요일 1:일 ...7:토
		firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		
	}
	
	public void display() {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("\t\t" + year + "년\t" + (month+1) + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<firstDayOfWeek; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			calendar.set(year, month,i);
			System.out.print(i +"\t");
			
			//각 일마다 날짜 확인하기위해서
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			
			if(calendar.get(Calendar.DAY_OF_WEEK)%7==0) {
				
				System.out.println();
			}
		}
		
	}

	
// --------------------
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.println("월 입력 : ");
		month = scan.nextInt() - 1;
		
		CalendarMain cal = new CalendarMain(year, month);
		
		cal.calc();
		cal.display();
	}
}
