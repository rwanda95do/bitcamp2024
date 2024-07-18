package sungJuk;

public class SungJukDTO implements Comparable<SungJukDTO> {
// ----------------------
	private int no, kor, eng, math, tot;
	private double avg;
	private String name;
	
// 생성자 -----------------
	public SungJukDTO() {}
	
// --GETTER & SETTER ----
	public int getNo() {return no;}
	public void setNo(int no) {	this.no = no;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getTot() {return tot;}
	
	public void setTot(int tot) {this.tot = tot;}
	public double getAvg() {return avg;}
	public void setAvg(double avg) {this.avg = avg;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
// ------
	@Override
	public String toString() {
		return  no + "\t" + name +"\t" +kor + "\t" + eng + "\t" +math + "\t" +tot + "\t" 
					+ String.format("%.2f", avg);
	}
	
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
	}

	@Override
	public int compareTo(SungJukDTO sungJukDTO) {
		// 총점으로 내림차순
		if(this.tot > sungJukDTO.getTot()) return -1; 
		else if(this.tot < sungJukDTO.getTot()) return 1; 
		else return 0;
	}

}
