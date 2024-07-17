package collection;

// 모든 자바 쿨래스는 extends Object
public class PersonDTO implements Comparable<PersonDTO>{ 
	private String name;
	private int age;
// ----생성자-------	
	public PersonDTO() {}
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
// ---GETTER&SETTER----
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	
// ---------------------
	// ---toString()---
	@Override
	public String toString() {
		return "이름:"+name+"\t나이:"+age;
	}
	
	// ---implements comparable<>---
	@Override
	public int compareTo(PersonDTO p) {
		/*
		// 나이로 오름차순
		if(this.age < p.age) return -1; // -1: 왼쪽이 더 크다
		else if(this.age > p.age) return 1; 
		else return 0;
		*/
		
		/*
		// 나이로 내림차순
		if(this.age < p.age) return 1; 
		else if(this.age > p.age) return -1; 
		else return 0;
		*/
		
		/*
		// 이름 내림차순 
		// 문자는 크기를 비교할수가 업성요 -> compareTO() 메소드가 이미 있음 
		return this.name.compareTo(p.name);
		*/
		
		// 이름 내림차순
		return this.name.compareTo(p.name)*-1;
	}
	
	
	
	
	
} // CLASS : PersonDTO
