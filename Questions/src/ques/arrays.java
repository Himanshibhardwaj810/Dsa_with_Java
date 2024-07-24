package ques;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To swap indices of two elements in an array
		int[] arr = { 1, 112, 15, 97, 108, 19, 2 };
		System.out.println(Arrays.toString(arr));
		swap(arr, 1, 5);// in this case only the elemnt is passed here 1,5 are the indices
		System.out.println(Arrays.toString(arr));
		int max = arr[0];// i can assume 0 but it can happen that -ve value exist

		for (int i = 0; i < arr.length; i++) {
			//edge cases
			if(arr==null || arr.length==0 ) {
				System.out.println("eneter valid array");
			}

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println("The maximum element is" + max);
		System.out.println("The maximum element i9n the range is" + maxrange(arr, 2, 6));

	}

	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
//		System.out.println(index1);
//		System.out.println(index2);//so it wil be swapped only not in the array
//		int temp=index1;
//		index1=index2;
//		index2=temp;
//		System.out.println(index1);
//		System.out.println(index2);

		// maximum element in the array

	}

	// to find the maximum element in range
	static int maxrange(int[] arr, int start, int end) {
		if(arr==null || arr.length==0 || end>start ) {
			return -1;
		
		}
		
		int max = arr[start];
		for (int i = start; i <= end; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		return max;

	}

}
