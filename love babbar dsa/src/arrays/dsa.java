package arrays;

import java.util.Arrays;

public class dsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//revesrse of number
		int[] arr= {15,25,34,45,56};
		int[]result=reverse(arr);
		System.out.println(Arrays.toString(result));
		System.out.println(maxelement(arr));
		System.out.println(minelement(arr));
		//to sort 0,1,2 elements
		int[]arr1= {0,2,1,2,0};
		sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//to place the negative elements into one side
		int[] ques= {-1,2,-3,4,5,6,-7};
		int[] ans=negative_sort(ques);
		System.out.println(Arrays.toString(ans));
		

	}
	static int[] reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {//so as to reverse till middle of array
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	
		return arr;
	}
	//max  element in array
	static int maxelement(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	//min element
	static int minelement(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	static void sort(int[]arr) {
		int i=0;
		int j=1;
		int k=2;
		int count_i=0;
		int count_j=0;
		int count_k=0;
		for(int a=0;a<arr.length;a++) {
			if(arr[a]==i) {
				count_i++;
			}
			else if(arr[a]==j) {
				count_j++;
			}else {
				count_k++;
			}
		}
		System.out.println(count_i);
		System.out.println(count_j);
		System.out.println(count_k);
		int index=0;
		for(int m=0;m<count_i;m++) {
			arr[index]=0;
			index++;
		}
		for(int n=0;n<count_j;n++) {
			arr[index]=1;
			index++;
		}
		for(int x=0;x<count_k;x++) {
			arr[index]=2;
			index++;
		}
		
			
		
	}
	//to place negative numbers into one side
	static int[] negative_sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	

}
