package arrays;

public class duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 2, 3 };
		System.out.println(duplicate(arr));

	}

	static int duplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
				
		}
	}
		return -1;

}
}
