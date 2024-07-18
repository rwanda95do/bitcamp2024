package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	public static void main(String[] args) {
	// 배열 비교 ---------
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};

		System.out.println("정렬정 : ");
		for(String data : ar) {
			System.out.print(data + "     ");
		}
		
		System.out.println();
		
		System.out.println("정렬 후 : ");
		Arrays.sort(ar);
		for(String data : ar) {
			System.out.print(data + "    ");
		}
		
	// 객체비교 ---------
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 85);
		PersonDTO cc = new PersonDTO("라이언", 59);
		
		// ArrayList에 담아야 객체를 통으로 이동 시킬 수 있는 느낌?
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬전 : ");
		for(PersonDTO data : list) {
			System.out.print(data + "     ");
		}
		
		System.out.println();
		
		Collections.sort(list);
		System.out.println("정렬후 : ");
		for(PersonDTO data : list) {
			System.out.print(data + "     ");
		}
		
	// 이름으로 내림차순 - 기준이 나이 오름차순 
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				
				return p1.getName().compareTo(p2.getName()) * -1;
			}
		};
		
		Collections.sort(list, com);
		for(PersonDTO data : list) {
			System.out.print(data + "     ");
		} 
	}
}
