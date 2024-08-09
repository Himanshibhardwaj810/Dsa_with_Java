package leetcode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class rotated_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we use different logic for this rotated binary search for peak element because in mountain element the array though inc first then dec but element are sorted
		//while in case of rotated binary search the element are first decreasing then inc
		int[] arr= {3,5,1};
		int target=3;
		System.out.println(findpivot(arr));
		System.out.println(search(arr, target));

	}
	//this will not work for duplicate values
	static int search(int[] nums,int target) {
		//if pivot element doesn't exist
		int pivot=findpivot(nums);
		if(pivot==-1) {
			//just do normal binary search
			return binarysearch(nums,target,0,nums.length-1);
			
		}
		//now if pivot element is found
		if(nums[pivot]==target) {
			return pivot;
		}
		//as numbber after pivot are shorter then target
		else if(target>=nums[0]) {
			System.out.println(target+"cob");
			System.out.println(nums[0]+"0th");
			System.out.println(pivot+"p");
			return binarysearch(nums,target,0,pivot-1);
			
		}else {
			
			return binarysearch(nums,target,pivot+1,nums.length-1);
		}
	}
	static int binarysearch(int[] arr, int target,int start,int end) {
		System.out.println(start);
		System.out.println(end);
	


		while (start <= end) {//here equal to is because at the end only one index will be left
			int mid = start + (end - start) / 2;
			System.out.println(mid+"");
			if (target > arr[mid]) {
				start = mid + 1; //rhs
			} else if (target < arr[mid]) {
				System.out.println(mid+"jhv");
				end = mid - 1;//lhs
			} else {
				System.out.println(mid+"");
				return mid;
			}
		}
		//When target is not found
		return -1;

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
