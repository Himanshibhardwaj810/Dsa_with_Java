package Linearsearch;

public class min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,4,-5,-2,54,12};
		System.out.println(min(arr));

	}
	static int min(int[] arr) {
		int min=arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		return min;
	}

}
