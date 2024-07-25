package Linearsearch;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,4,-5,-2,54,12};
		int elementtofind=-2;
		System.out.println(linearsearch2(arr,elementtofind));
		System.out.println(linearsearchinrange(arr,elementtofind,1,2));

	}
	static int linearsearch(int[]arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int index=0;index<arr.length;index++) {
			int element=arr[index];
			if(element==target) {
				return index;//or do return elemnt if you want the elemnt
			}
		}
		return -1;
	}
	static int linearsearch2(int[]arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int element: arr) {
			if(element==target) {
				return element;//or do return elemnt if you want the elemnt
			}
		}
		return -1;
	}
	
	//To find in the range
	static int linearsearchinrange(int[]arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for (int index=start;index<=end;index++) {
			int element=arr[index];
			if(element==target) {
				return index;//or do return elemnt if you want the elemnt
			}
		}
		return -1;
	}

}
