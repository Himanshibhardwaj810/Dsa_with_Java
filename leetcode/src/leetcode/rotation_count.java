package leetcode;

public class rotation_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2,3};
		System.out.println(countrotation(arr));

	}
	static int countrotation(int[] arr) {
		int pivot=findpivot(arr);
		if(pivot==-1) {
			//array is not rotated
			return 0;
		}else {
			return pivot+1;//we can only return pivo1 +1 even if pivot is -1 as -1+1=0
		}
		
	}
	//without duplicated values
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
				return mid - 1;
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



