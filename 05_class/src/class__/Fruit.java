package class__;

public class Fruit {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar;
	
	public Fruit() {}
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	public void calcTot() {
		// 과일당 합계
		tot = jan + feb + mar;
		
		//월별 합계
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display() { // 각 과일별 출력
		System.out.println(pum + "\t " + jan + "\t " + feb + "\t " + mar + "\t " + tot + "\t ");
	}
	public static void output() { // 월별 합계 출력
		System.out.println("\t " + sumJan +"\t " +  sumFeb +"\t " +  sumMar);
	}
	
	
}
