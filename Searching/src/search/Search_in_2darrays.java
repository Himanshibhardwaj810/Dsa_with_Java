package search;

public class Search_in_2darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 15;
		System.out.println(searcharr(arr, target));

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

}
