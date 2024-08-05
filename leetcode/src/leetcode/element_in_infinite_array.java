package leetcode;

public class element_in_infinite_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3, 5, 7, 9, 10, 90, 
                100, 130, 140, 160, 170};
		int target=10;
		System.out.println(ans(arr,target));

	}
	//for finding element in infinite array
	//in this ques arr.length can't be used
	static int ans(int[] arr,int target) {
		int start=0;
		int end=1;
		
		while(target>arr[end]) {
			int newstart=end+1;//this is my new start
			//double the size of elements between start and end
			//new end=1+double the size of box
			end=end+((end-start+1)*2);
			start=newstart;
			
		}
		System.out.println(start);
		System.out.println(end);
		return binarysearch(arr,target,start,end);
		
	}
	static int binarysearch(int[] arr, int target,int start,int end) {
		

		while (start <= end) {//here equal to is because at the end only one index will be left
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1; //rhs
			} else if (target < arr[mid]) {
				end = mid - 1;//lhs
			} else {
				return mid;
			}
		}
		//When target is not found
		return -1;

	}

}
