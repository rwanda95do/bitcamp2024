package class__;

public class Fruit {
	private String pum;
	private int jan, feb, mar, tot;
	private int sumJan, sumFeb, sumMar;
	
	public Fruit() {}
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	public String getPum() {return pum;}
	public int getJan() {return jan;}
	public int getFeb() {return feb;}
	public int getMar() {return mar;}
	public int getTot() {return tot;}
	public int getSumJan() {return sumJan;}
	public int getSumFan() {return sumFeb;}
	public int getSumMan() {return sumMar;}
	
	
	public void calcTot() {
		tot = jan + feb + mar;
	}
	public void display() {
		System.out.println(pum + "\t " + jan + "\t " + feb + "\t " + mar + "\t " + tot + "\t ");
	}
	public static void output() {
		
	}
	
	
}
