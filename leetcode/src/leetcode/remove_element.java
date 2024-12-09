package leetcode;
import java.util.*;
public class remove_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3 };
		int val = 3;
		System.out.println(removeElement(nums,val));

	}
	public static int removeElement(int[] nums, int val) {
		int[] nums1=new int[5];
		int j=0;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
//			if(nums[i]==val) {
//				i++;
//			}else {
//			nums1[j]=nums[i];
//			j++;
//			}
		}
		System.out.println(Arrays.toString(nums1));
		int k=nums1.length;
		return k;
	
	}

}
