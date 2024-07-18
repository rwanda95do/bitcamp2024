package sungJuk;

import java.util.ArrayList;

public class SungJukPrint implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		for(SungJukDTO sungJukDTO : list) {
			System.out.println(sungJukDTO.toString());  // 오버라이딩해놔서 주소로 나오지 않음.
		}
		
	}
	
}
