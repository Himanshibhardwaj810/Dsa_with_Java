package Binarysearch;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -13,-2,2, 4, 9, 10, 21, 35, 45, 47, 48 };
		int target =35;
		int[] arr2= {45,35,25,15,4,3,2};
		System.out.println(binarysearch(arr,target));
		System.out.println(binarysearchdesc(arr2,target));

	}
//For ascending order binary search
	static int binarysearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {//here equal to is because at the end only one index will be left
			int mid = start + (end - start) / 2;
			if(arr[mid]==target) {
				return mid;
			}
			if (target > arr[mid]) {
				start = mid + 1; //rhs
			} else  {
				end = mid - 1;//lhs
			} 
		}
		//When target is not found
		return -1;

	}
	//for descending order binary search
	static int binarysearchdesc(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {//here equal to is because at the end only one index will be left
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				start = mid + 1;//rhs
			} else if (target > arr[mid]) {
				end = mid - 1;//lhs
			} else {
				return mid;
			}
		}
		//When target is not found
		return -1;

	}

}
