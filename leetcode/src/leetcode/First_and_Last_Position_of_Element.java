package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class First_and_Last_Position_of_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,5,7,7,7,8,9};
		int target=7;
		System.out.println(Arrays.toString(searchrange(nums,target)));

	}
	static int[] searchrange(int[] nums,int target) {
		int[] ans= {-1,-1};
		//find the first and last index of element in sorted array
//		int ans[0]=search(nums,target,true);
//		int ans[1]=search(nums,target,false);
//		if(ans[0]!=-1) {
//			int end=search(nums,target,false);
//		}
//			
		
		int start=search(nums,target,true);
		int end=search(nums,target,false);
		System.out.println(start);
		
		ans[0]=start;
		ans[1]=end;
		
		return ans;
		
		
	}
	static int search(int[] nums, int target,boolean findindex) {
		int ans=-1;
		int start = 0;
		int end = nums.length - 1;
		//but if the target element is greatest than the last element of array
		
	

		while (start <= end) {//here equal to is because at the end only one index will be left
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1; //rhs
			} else if (target < nums[mid]) {
				end = mid - 1;//lhs
			} else {
				//potential ans found
				ans=mid;
				if(findindex) {
					end=mid-1;//searching for 1st index
				}else {
					start=mid+1;//searching for last index
				}
			}
		}
		System.out.println(ans);
		return ans;

	}

}
