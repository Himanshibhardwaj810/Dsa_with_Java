package leetcode;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class search_in_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,3,1};
		int target=3;
		
		System.out.println(search(arr,target));
		

	}
	 static int search(int[] arr,int target) {
		 //we are finding the peak element first as it suggest till where the increasing array exist
		 //similarly for dec array(give us the end point )
		int peak=peakIndexInMountainArray(arr);
		int firsttry=orderagnosticbinarysearch(arr,target,0,peak);
		if(firsttry!=-1) {
			return firsttry;
		}
		//find in rhs dec array
		return orderagnosticbinarysearch(arr,target,peak+1,arr.length-1);
		
			
		
	}
	
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
	
	static int orderagnosticbinarysearch(int[] arr, int target,int start,int end) {

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
