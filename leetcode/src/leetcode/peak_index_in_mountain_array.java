package leetcode;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peak_index_in_mountain_array {
//we don't have target elemnt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,2,5,2,1};
		System.out.println(peakIndexInMountainArray(arr));//returning index

	}

	// in this ques target is not given to compare in binary search
	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {// = is not used as when s=e this is termination
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// we are in the dec part and have to check lhs
				end = mid;// as we have to check from mid as it can also be largest

			} else {
				// we are in inc part of the array
				// and mid +1 is greater we have to find peak element then no need to check mid
				start = mid + 1;
			}

		}
		//when start==end and every time every check they contain possible  max element 
		//and when they are pointing to single element then that will be peak element
		return start; //or return end

	}

}
