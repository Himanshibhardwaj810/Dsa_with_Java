package Ques;

import java.util.Arrays;
import java.util.Scanner;

public class rotation_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,8,10};
		System.out.println(Arrays.toString(arr));
		
		int k=3;
		
//		singlerotation(arr);
//		System.out.println(Arrays.toString(arr));
		
	
		krotation(arr,k);
		System.out.println(Arrays.toString(arr));

	}
	//for kth rotation
		static void krotation(int[] arr,int k) {
			for(int i=0;i<k;i++) {
				singlerotation(arr);
			}
		}
		
		//for single rotation of array
		static void singlerotation(int[] arr) {
//			if(arr.length<=1) {
//				return -1;//return;
//			}
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
				
			}
			
			arr[arr.length-1]=temp;
			
		}


}
