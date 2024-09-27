package recursion;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,5,8,10};
		int target=5;
		int ans=search(arr,target,0,arr.length-1);
		System.out.println(ans);

	}
	
	static int search(int[] arr,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			return search(arr,target,start,mid-1);
		}else {
			return search(arr,target,mid+1,end);
		}
	}

}
