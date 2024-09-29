package arrays_recursion;

public class array_is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,13,8,9};
		System.out.println(issorted(arr,0));

	}
	
	static boolean issorted(int[] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1] && issorted(arr,index+1);
	}

}
