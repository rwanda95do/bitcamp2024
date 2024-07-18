package sungJuk_T;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();

		int count=0;
		
		/*
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getName().equals(name)) {
				list.remove(sungJukDTO);
				count++;
			}
		}//for
		*/
		
		
		Iterator<SungJukDTO> it = list.iterator();
		
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next();
			
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); //it.next()가 반환한 항목을 제거한다.
				count++;
			}
		}//while
		
		if(count == 0) 
			System.out.println("회원의 정보가 없습니다");
		else 
			System.out.println(count + "건의 항목을 삭제하였습니다");
	}

}










