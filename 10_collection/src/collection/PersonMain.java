package collection;

import java.util.ArrayList;

public class PersonMain {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 25);
		PersonDTO cc = new PersonDTO("라이언", 25);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
	}

	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();
		System.out.println(list);
		
		// 방법1
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "   " + list.get(i).getAge());
		}
		
		for(PersonDTO personDTO : list) {
			//방법2
			//System.out.println(personDTO.getName() + "   " + personDTO.getAge());
			//방법3. toString() 오버라이드
			System.out.println(personDTO);
		}
		
		/*
		PersonDTO personDTO = new PersonDTO();
		
		System.out.println(personDTO);  // .toString()메소드가 생략되어있다
		System.out.println(personDTO.toString()); 

		// toString이 PersonDTO클래스에 없는데?
		// 모든 클래스는 extends Object -> toString()은 Object클래스꺼
		
		personDTO.setName("홍길동");
		personDTO.setAge(25);
		System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		System.out.println(personDTO);
		
		PersonDTO personDTO2 = new PersonDTO("ggg",30);
		System.out.println(personDTO2);
		*/
		
	}
}

