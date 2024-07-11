package class_;

public class SungJukMain02 {
	public static void main(String[] args) {
	
		SungJuk p1 = new SungJuk();
		p1.setData("홍길동", 90, 96, 100);
		p1.calc();
		
		
		SungJuk p2 = new SungJuk();
		p2.setData("라이언", 80, 86, 80);
		p2.calc();

		
		System.out.println("--------------------------------");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점\t");
		System.out.println(p1.getName()+"\t " + p1.getKor() + "\t " + p1.getEng() + "\t "+ p1.getMath()+ "\t " + p1.getTot() + "\t " + p1.getAvg() + "\t " + p1.getGrade());
		System.out.println(p2.getName()+"\t " + p2.getKor() + "\t " + p2.getEng() + "\t "+ p2.getMath()+ "\t " + p2.getTot() + "\t " + p2.getAvg() + "\t " + p2.getGrade());
		System.out.println("--------------------------------");
		
		
	}
}
