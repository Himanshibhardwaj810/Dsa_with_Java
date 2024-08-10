package twodarray;
import java.util.*;

public class Bs_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		int target=16;
//		System.out.println(Arrays.toString(search(arr,target)));
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));

	}
	static int[] search(int[][] arr,int target) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length&&col>=0) {
			if(arr[row][col]==target) {
				return new int[] {row,col};
			}else if(arr[row][col]>target) {
				col--;
			}else {
				row++;
			}
		}
		return new int[]{-1,-1};
	}

}
