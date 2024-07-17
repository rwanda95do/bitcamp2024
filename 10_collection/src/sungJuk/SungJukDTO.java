package sungJuk;

public class SungJukDTO {
// ----------------------
	private int no, kor, eng, math, tot;
	private double avg;
	private String name;
	
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
					+  avg;
		// 형식 바꾸는거 Deci어쩌고 
	}
	
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
	}

}
