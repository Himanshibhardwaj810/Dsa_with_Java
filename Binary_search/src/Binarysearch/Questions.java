package Binarysearch;

public class Questions {
	// find the ceiling number
	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 9, 18 };
		int target = 10;
		//if want to return the index of particular element then just call the function
		int ceiling=arr[ceiling(arr, target)];
		System.out.println("the ceiling is " + ceiling);
		int floor=arr[floor(arr, target)];
		System.out.println("the floor is " + floor);

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
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
			
		}
		return start;

	}
	//floor of number
	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		////but if the target element is smallest than the last elemnt of array
		if(target<arr[start]) {
			return -1;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
			
		}
		return end;

	}
}
