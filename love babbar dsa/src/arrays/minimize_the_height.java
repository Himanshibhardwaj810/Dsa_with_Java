package arrays;

import java.util.Arrays;

public class minimize_the_height {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 9, 12, 16, 20};
		int k=3;
		System.out.println(minimize_height(arr,k));
	}
	static int minimize_height(int[]arr,int k) {
		Arrays.sort(arr);
		int n=arr.length;
		int height_diff=arr[n-1]-arr[0];
		int maxH;
		int minH;
		int ans;
		for(int i=0;i<n-1;i++) {//here loop is upto n-2 because of i+1 we are accessing next  tower from current one
			maxH=Math.max(arr[n-1]-k,arr[i]+k);
			minH=Math.min(arr[0]+k,arr[i+1]-k);//so it will lead to index out of bpund error at index=4
			
			if(minH<0) {
				continue;//to skip the current iteration and move to next i++ or j++;
			}
			 height_diff=Math.min(height_diff,maxH-minH);
		}
		return height_diff;
	    }
}
