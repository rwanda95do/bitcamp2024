package multiArray;

public class MultiArray02 {
	public static void main(String[] args) {
		
		int[][] ar = new int[10][10];
		
		int num=0;
		
		// 입력
		/*
		for(int i=0; i<ar.length; i++) { // 행
			for(int j=0; j<ar[i].length; j++) { // 열
				num++;
				ar[i][j] = num; 
				//ar[j][i] = num; // 행열전환
			}
		}
		*/
		for(int i=ar.length-1; i>=0; i--) { // 행
			for(int j=ar[i].length-1; j>=0; j--) { // 열
				num++;
				ar[i][j] = num; 
			}
		}
		
		// 출력
		for(int i=0; i<ar.length; i++) { // 행
			for(int j=0; j<ar[i].length; j++) { // 열
				System.out.println("ar["+i+"]["+j+"] : "+ar[i][j]);
			}
			System.out.println();
		}
	}
}
