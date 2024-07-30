package ques;

import java.util.Scanner;

import java.util.Arrays;

public class PDtechnical_questions_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,8,10};
		System.out.print(Arrays.toString(arr));
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of times yoy want to rotate the array");
		int k=in.nextInt();
		
		
		
	
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
//		if(arr.length<=1) {
//			return -1;//return;
//		}
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
