package twodarray;
import java.util.*;

public class Bs_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{11,22,33,43},
				{51,62,78,81},
				{94,101,110,121},
				{132,145,154,161}
				
		};
		int target=132;
//		System.out.println(Arrays.toString(search(arr,target)));
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));

	}
	static int[] search(int[][] arr,int target) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length&&col>=0) {
			System.out.println(row+"jds");
			System.out.println(col+"hvbhbj");
			if(arr[row][col]==target) {
				return new int[] {row,col};
			}else if(arr[row][col]>target) {
				col--;
			}else {
				row++;//as we are standing at the last position of row 
				//and it is less so we have to go to next row for further checking
			}
		}
		return new int[]{-1,-1};
	}

}
