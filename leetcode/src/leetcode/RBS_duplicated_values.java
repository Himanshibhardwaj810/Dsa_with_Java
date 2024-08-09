package leetcode;

public class RBS_duplicated_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we use different logic for this rotated binary search for peak element because in mountain element the array though inc first then dec but element are sorted
		//while in case of rotated binary search the element are first decreasing then inc
		int[] arr= {2,2,9,2,2};
		int target=2;
		System.out.println(findpivotwithduplicatevalues(arr));
		System.out.println(search(arr, target));

	}
	//this will not work for duplicate values
	static int search(int[] nums,int target) {
		//if pivot element doesn't exist
		int pivot=findpivotwithduplicatevalues(nums);
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

	static int findpivotwithduplicatevalues(int[] arr) {
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
			// if the start end target pointing to same number then ignore duplicates
			
			if (arr[mid]==arr[start]&& arr[mid]==arr[end]) {
				//what  if the start is pivot
				if(arr[start]>arr[start+1]) {
					return start;
				
				}
				start++;
				if(arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;
			}
			//left side is sorted so we have to check the rhs
			else if(arr[start]<arr[mid] ||(arr[start]==arr[mid] && arr[mid]>arr[end])) {
				start=mid+1;
				
			}else {
				end=mid-1;
			}

		}
		return -1;
	}


}
