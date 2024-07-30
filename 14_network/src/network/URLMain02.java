package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

// 주어진 사이트(쿠팡)에서 14K와 18K단어가 몇개이지 찾기 => 물품 검색
	// 참고 05_class프로젝트 StringReplace

public class URLMain02 {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://www.goldria.net/m/product_list.html?xcode=012");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		
		int count_14K=0;
		int count_18K=0;
		
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
			//System.in.read();
			//System.in.read();
			
			if(line.contains("18k")) {
				count_18K++;
			}
			if(line.indexOf("14k") >-1){
				count_14K++;
			}
			
		}
		
		System.out.println("18k" + count_18K);
		System.out.println("14k" + count_14K);
		br.close();
	}

}
