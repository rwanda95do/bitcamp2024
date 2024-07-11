package class_;

public class SungJuk {
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	
	// set ---------
	public void setData(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math= m;
	}
	
	// get ----------
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
		
	}
	public char getGrade() {
		return grade;
	}
	
	// -------------
	public void calc(){
		tot = kor + eng + math;
		avg = tot/3;
		switch((int)(avg/10)){
			case 10: 
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade='F';
		}
	}
	
	
	
}
