package Binarysearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class First_and_Last_Position_of_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		//but if the target element is greatest than the last elemnt of array
		if(target>arr[end]) {
			return -1;
		}
	

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target==arr[mid]) {
				end=mid-1;
			}
			
		}
		return start;

	}

}
