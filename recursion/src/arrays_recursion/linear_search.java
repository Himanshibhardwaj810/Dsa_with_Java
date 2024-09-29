package arrays_recursion;

import java.util.ArrayList;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,54,21,21,21,35};
		int target=21;
		System.out.println(linearsearch(arr,target,0));
		System.out.println(linearsearchint(arr,target,0));
		System.out.println(linearsearchfromlast(arr,target,arr.length-1));
		//for multiple occurencess
		findallindex(arr,target,0);
		System.out.println(list);

	}
	
	static boolean linearsearch(int [] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || linearsearch(arr,target,index+1);
	}
	//returning index
	static int linearsearchint(int [] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target ) {
			return index;
		}
		return linearsearchint(arr,target,index+1);
	}
	//from last
	static boolean linearsearchfromlast(int [] arr,int target,int index) {
		if(index==-1) {
			return false;
		}
		return arr[index]==target || linearsearch(arr,target,index-1);
	}
	
	//for multiple occurences in array
	static ArrayList<Integer> list=new ArrayList<>();
	static void findallindex(int [] arr,int target,int index) {
		if(index==arr.length) {
			return;
		}
		if(arr[index]==target ) {
			list.add(index);
		}
		findallindex(arr,target,index+1);
	}
	

}
