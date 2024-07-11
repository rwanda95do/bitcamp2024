package multiArray;

public class MultiArray04 {
/*
	[문제] 성적 계산

	1. 공식
	총점 = 국어 + 영어 + 수학
	평균 = 총점 / 과목수
	학점은 평균이 90이상이면 A
	          80이상이면 B
	          70이상이면 C
	          60이상이면 D
	그 외는 F

	2. 평균은 소수이하 2째자리까지 출력        
	          
	----------------------------------------------------
	이름 국어 영어 수학 총점 평균 학점
	----------------------------------------------------
	홍길동 90 95 100
	프로도 100 89 76
	라이언 75 80 48
	----------------------------------------------------

*/
	
	public static void main(String[] args) {
	
		String name[] = {"홍길동", "프로도", "라이언"};
		int jumsu[][] =  {{90, 95, 100, 0},{100, 89, 76,0},{75, 80, 48,0}};
		double avg[] = new double[3];
		char grade[] = new char[3];
		
		
		
		//jumsu 총점 입력--------------------------------
		for(int i=0; i<jumsu.length; i++) { // 행
			for(int j=0; j<jumsu[i].length-1; j++) { // 열
				jumsu[i][3] += jumsu[i][j];
			}
		} 
		
		// avg 평균 입력------------------------------
		for(int i=0; i<avg.length; i++) { // 행
			avg[i] = jumsu[i][3] / 3.0;
		}
		
		// grade 학점 입력------------------------------
		for(int i=0; i<avg.length; i++){ // 3번 
			switch((int)avg[i]/10){
				case 10: 
				case 9: grade[i] = 'A'; break;
				case 8: grade[i] = 'B'; break;
				case 7: grade[i] = 'C'; break;
				case 6: grade[i] = 'D'; break;
				default : grade[i]='F';
			} // switch
		} //for
		
		// ----------------------------
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름 \t국어 \t영어 \t수학 \t총점 \t평균 \t학점");
		System.out.println("----------------------------------------------------");
		
		for(int n=0; n<3; n++) {
			System.out.print(name[n]);
			for(int m=0; m<4;m++) {
				System.out.print(String.format("\t%d", jumsu[n][m]));				
			}
			System.out.print(String.format("\t%.2f", avg[n]));	
			System.out.print("\t"+(grade[n]));	
			System.out.println();
		}
		
	
		
	} // main
}
