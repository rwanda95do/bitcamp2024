package multiArray;

public class MultiArray03 {
	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}}; // 4행 4열
		
		
		//행의 합 구하기
		for(int i=0; i<ar.length; i++) { // 행
			for(int j=0; j<ar[i].length-1; j++) { // 열
				ar[i][ar.length-1] += ar[i][j];
				ar[ar.length-1][i] += ar[j][i];
			}
		}
		
		// 출력
		for(int i=0; i<ar.length; i++) { // 행
			for(int j=0; j<ar[i].length; j++) { // 열
				System.out.print(String.format("%5d", ar[i][j]));
			}
			System.out.println();
		}
	}
}

