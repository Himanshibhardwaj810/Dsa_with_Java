package ques;

import java.util.Scanner;

import java.util.Arrays;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr= new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
			
		}
		in.close();
		
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	static void swap(int[]arr,int start,int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
