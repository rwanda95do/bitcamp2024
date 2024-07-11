package homework;

// 하나
public class MemberDTO {
	private String name, phoneNumber, adress; //이름, 핸드폰번호, 주소
	private int age; // 나이
	
	// setter ----------------------------
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter -----------------------------
	public String getName() {return name;}
	public String getPhoneNumber() {return phoneNumber;}
	public String getAdress() {return adress;}
	public int getAge() {return age;}
	
	
}
