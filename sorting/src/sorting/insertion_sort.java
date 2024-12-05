package sorting;
import java.util.*;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,6,1,3};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		
			
		}
		
	}

}
