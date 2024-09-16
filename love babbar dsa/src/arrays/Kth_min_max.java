package arrays;

import java.util.Arrays;

public class Kth_min_max {

	public static void main(String[] args) {
	//kth min element
		int[]arr= {25,15,3,12,5};
		insertion_sort(arr);
		System.out.println(Arrays.toString(arr));
		//for kth min
		int k=3;
		System.out.println(arr[k-1]);
		//for max element
		reverse(arr);
		k=2;
		System.out.println(arr[k-1]);
		
	}
	//insertion sort
	static void insertion_sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
			
				j=j-1;
			}
			arr[j+1]=key;
			
		}
	}
	static int[] reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {//so as to reverse till middle of array
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	
		return arr;
	}
}