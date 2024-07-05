package if_;

public class Sungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[문제] 성적 계산
		//이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

		//[조건]
		//총점 = 국어 + 영어 + 수학
		//평균 = 총점 / 과목수
		//평균의 소수이하 3째자리까지 출력
		//학점: 평균이 90>=A 80>=B 70>=C 60>=D 그외 F

		//[실행결과]
		// *** L 성적표 ***
		//국어 영어 수학 총점 평균
		//85 90 100 xxx xx.xxx
		
		char name = 'L';  // String name = "L";
		int kor=85, eng=90, math=100;
		int tot=0;
		double avg=0;
		char grade='0';
		
		tot = kor + eng + math;
		avg = (double)tot / 3;
		
		if(avg>=90) grade='A';
		if(avg <90 &&avg>=80) grade='B';
		if(avg <80 &&avg>=70) grade='C';
		if(avg <70 &&avg>=60) grade='D';
		if(avg <60) grade='E';
		
		System.out.println("*** L 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg) + "\t" + grade);
	
	}

}
