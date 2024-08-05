package leetcode;

public class rotated_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2};
		System.out.println(findpivot(arr));

	}

	static int findpivot(int[] arr) {
		// pivot is the largest element in the sorted sorted array
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4cases
			// if the mid is last element then for mid+1 index out of bpound
			// so in and condition if first one is false it doesn't check the another
			// condition

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return arr[mid - 1];
			}
			// al the elements after mid are shorter then start so ignore as we have to
			// check the greatest element
			if (arr[mid] <= arr[start]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
