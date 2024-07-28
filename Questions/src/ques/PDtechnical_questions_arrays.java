package ques;

import java.util.Arrays;

public class PDtechnical_questions_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,8,10};
		System.out.print(Arrays.toString(arr));
		singlerotation(arr);
		System.out.print(arr);
		

	}
	static void singlerotation(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1]=temp;
	}

}
