package sorting;

import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {4,1,2,6,8};
		int[] ans=merge_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));

	}
	static int[] merge_sort(int[] arr,int start,int end) {
		if(start==end) {
			return new int[] {arr[start]};
		}
		
		int mid=start+(end-start)/2;
		int[] left=merge_sort(arr,start,mid);
		int[] right=merge_sort(arr,mid+1,end);
		
		return merge(left,right);
	}
	static int[] merge(int[]left,int[]right) {
		int i=0;
		int j=0;
		int k=0;
		int[] res=new int[left.length+right.length];
		
		while( i<left.length && j<right.length) {
			if(left[i]>right[j]) {
				res[k]=right[j];
				j++;
				k++;
			}else {
				res[k]=left[i];
				i++;
				k++;
			}
		}
		while(i<left.length) {
			res[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			res[k]=right[j];
			j++;
			k++;
		}
		return res;
	}

}
