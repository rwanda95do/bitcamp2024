package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lotto {
/*
	[문제] 로또 프로그램 - 자동 번호
	1. 1 ~ 45까지의 정수형 값을 가진 6개인 배열이다.
	2. 중복된 숫자를 가지면 안된다.
	3. 오름차순
	4. 1줄당 1000원이다.
	5. 출력시 5자리로 맞춘다.
	6. 5줄마다 줄바꿈을 한다.

	[실행결과]
	돈 입력 : 3200
	    2    4   19   39   43   44
	   22   26   33   38   39   42
	    5    6    8   25   35   45
	    
	현금 입력 : 7000    
	    2    4   19   39   43   44
	   22   26   33   38   39   42
	    5    6    8   25   35   45
	    3   14   23   30   34   35
	   18   20   25   27   32   37

	    1   16   32   34   41   42
	    5    6   18   30   33   44

*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈입력 : ");
		int money=sc.nextInt()/1000;  // 몇 개 돌려줄지
	
		
		for(int r=1; r<=money; r++) {
			int[] lotto = new int[6];
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = new Random().nextInt(45)+1;			
			} // 기본 로또 번호 생성
			
			
			
			
			for(int a=0; a<lotto.length; a++) {
				for(int b=0; b<lotto.length; b++) {
					if(a!=b && lotto[a]==lotto[b]) {
						lotto[b] = new Random().nextInt(45)+1;	
					}
				}
			}// 로또번호 중복 없애기	
		
			
			Arrays.sort(lotto);	// 로또번호 정렬
			
			for(int d: lotto) {
				System.out.print(String.format("%5d", d) + "\t");
			} //5자리씩 로또번호 출력
			
			System.out.println(); // 한줄(1000원)씩 ENTER
			
			if(r%5==0) {
				System.out.println();
			} // 5줄마다 줄바꿈 
		}
		
	}
}
