package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		int count =0;
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				
				list.remove(i);
				i--;
				
				count++;
			} 			
		} // for
		
		if(count ==0) {
			System.out.println("회원의 정보가 없습니다.");			
		} else {
			System.out.println(count + "건의 항목을 삭제하였습니다.");
		}
		
	} // excute
} 
