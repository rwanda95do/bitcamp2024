package inheritance;

public class Super {
	protected double weight, height;
	
	public Super() {System.out.println("CLASS Super() : 기본생성자");} // 기본 생성자
	public Super(double weight, double height) {
		System.out.println("CLASS Super(double, double) 생성자");
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}
}



