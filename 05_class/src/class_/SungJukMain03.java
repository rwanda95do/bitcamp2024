package class_;

public class SungJukMain03 {
	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; // 주소가 드가면 4바이트

		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		
		ar[0].setData("홍길동", 90, 96, 100);
		ar[1].setData("라이언", 80, 86, 80);
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
			System.out.println(ar[i].getName()+"\t " + ar[i].getKor() + "\t " + ar[i].getEng() + "\t "+ ar[i].getMath()+ "\t " + ar[i].getTot() + "\t " + ar[i].getAvg() + "\t " + ar[i].getGrade());
		}
	}
}
