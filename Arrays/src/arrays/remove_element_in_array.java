package arrays;
import java.util.Scanner;
import java.util.*;
public class remove_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,3,7,8};
		int element=3;
		int [] result=removelements(arr,element);
		System.out.println(Arrays.toString(result));
		

	}
	static int[] removelements(int[]arr,int element) {
		int count=0;
		for(int nums:arr) {
			if(nums==element) {
				count++;
			}
		}
		int [] result= new int[arr.length-count];
		int index=0;
		for(int nums:arr) {
			if(nums!=element) {
				result[index++]=nums;
			}
			
		}
		return result;
	}

}
