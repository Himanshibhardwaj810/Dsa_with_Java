package arrays;

import java.util.Arrays;

public class rotation_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,8,7,9};
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
		

	}

}
