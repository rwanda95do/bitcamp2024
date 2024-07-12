package homework;

// 하나
public class MemberDTO {
	private String name, phoneNumber, address; //이름, 핸드폰번호, 주소
	private int age; // 나이
	
	// 생성자 -------------------------
	public MemberDTO() {	} // 기본 생성자
	public MemberDTO(String name, int age, String phoneNumberm, String Address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
	}
	
	// setter ----------------------------
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter -----------------------------
	public String getName() {return name;}
	public String getPhoneNumber() {return phoneNumber;}
	public String getAdress() {return address;}
	public int getAge() {return age;}
	

	
}
