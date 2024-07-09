package homework;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {25, 36, 30, 45, 28};
		
		
		System.out.println("정렬전 : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
		
		System.out.println("\n");
		System.out.println("Bubble Sort");
		
		// Bubble Sort 하기 싫어.. 집에 가고 시어..
		int tmp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
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
