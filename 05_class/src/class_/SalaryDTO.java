package class_;

public class SalaryDTO {
	private String name, job; // [이름, 직급]
	private int basic, extra, total, tax, salary; // 기본급, 수당, 합계,세금, 월급
	private double rate; // 세율
	
	// setter ----------------
	public void setData(String n, String j, int b, int e){
		name = n;
		job = j;
		basic= b;
		extra = e;
	}
	
	// getter -------------------
	public String getName() {return name;}
	public String getJob() {return job;}
	public int getBasic() {return basic;}
	public int getExtra() {return extra;}
	public int getTotal() {return total;}
	public double getRate() {return rate;}
	public int getTax() {return tax;}
	public int getSalary() {return salary;}
	
	// method ---------------
	public void calc(){
		total = basic + extra; // 합계=기본급 + 수당
		if(total >= 5000000) {
			rate = 0.03; //세율			
		}else if(total >= 3000000) {
			rate = 0.02; //세율
		}else {
			rate = 0.01; //세율
		}
		
		tax = (int)(total*rate); //세금 = 합계*세육
		salary = total-tax; //월급 = 합계-세금
	}
}



