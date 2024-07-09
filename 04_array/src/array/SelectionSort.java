package array;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {25, 36, 30, 45, 28};
		
		
		System.out.println("정렬전 : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
		
		System.err.println();
		
		// Selection Sort
		int tmp;
		for(int i=0; i<arr.length-1; i++) {
			int num = arr[i];
			for(int j=1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { //오름차순
				//if(arr[i]<arr[j]) {  // 내림차순	
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				for(int r:arr) {System.out.print(r+"   ");}
				System.out.println();
			}		
			System.out.println();
			
		}
		
		
		
		
		
		System.out.println("정렬후 : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
	}
}
