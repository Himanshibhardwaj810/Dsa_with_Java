package search;

import java.util.Arrays;

public class Search_in_2darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6,81,34 }, { 7, 8, 9 } };
		int target = 81;
		int[] ans = searcharr2(arr, target);
		System.out.println(Arrays.toString(ans));
		System.out.println(searcharr(arr, target));
		System.out.println(max(arr));
		System.out.println("enhanced version "+maxenhanced(arr));
		
		

	}

	static boolean searcharr(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return true;

				}

			}

		}
		return false;

	}

	static int[] searcharr2(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };

				}

			}

		}
		return new int[]{ -1, -1 };

	}
	//to find the max element in 2d array
	static int max(int[][] arr) {
//		int max=arr[0][0];
		int max=Integer.MIN_VALUE;
				
		System.out.println("first index "+max);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col]>max) {
					max=arr[row][col];

				}

			}

		}
		return max;

	}
	static int maxenhanced(int[][] arr) {
//		int max=arr[0][0];
		int max=Integer.MIN_VALUE;
				
		System.out.println("first index "+max);
		for(int[] ints: arr) {
			for(int element: ints) {
				if (element>max) {
					max=element;

				}

			}

		}
		return max;

	}


}
