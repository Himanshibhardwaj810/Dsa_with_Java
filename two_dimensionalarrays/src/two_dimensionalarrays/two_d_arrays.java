package two_dimensionalarrays;

import java.util.Scanner;

import java.util.Arrays;

public class two_d_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[3][];

		int[][] arr1 = { { 1, 2, 3 },
				{ 4, 5 },
				{ 7, 8, 9 }

		};
		
		for(int[] arr:arr1) {
			System.out.println(Arrays.toString(arr));
		}
		
		// input
		int arr2[][] = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("enter elements");
		// for rows
		for (int row = 0; row < arr2.length; row++) {
			// for cols
			for (int col = 0; col < arr2[row].length; col++) {
				arr2[row][col] = in.nextInt();
			}
		}
		for (int row = 0; row < arr2.length; row++) {
			// for cols
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("2nd method");
		//to print 2d array
		for (int row = 0; row < arr2.length; row++) {
			// for cols
			//not the best practise
				System.out.println(Arrays.toString(arr2[row])+" ");
			
		}
		System.out.println("3rd method");
		for(int[] nums: arr2) {
			System.out.println(Arrays.toString(nums));
		}

	}

}
