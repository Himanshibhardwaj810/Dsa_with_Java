package Binarysearch;

public class orderagnosticbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 45,35,25,15,4,3,2 };
		int target = 35;

		System.out.println(orderagnosticbinarysearch(arr, target));

	}

	static int orderagnosticbinarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean isasc = arr[start] <= arr[end];

		while (start <= end) {// here equal to is because at the end only one index will be left

			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isasc) {//for ascending
				if (target > arr[mid]) {
					start = mid + 1; // rhs
				} else  {
					end = mid - 1;// lhs
				}
			} else {//for descending
				if (target < arr[mid]) {
					start = mid + 1;// rhs
				} else  {
					end = mid - 1;// lhs
				}
			}
		}
		// When target is not found
		return -1;

	}

}
