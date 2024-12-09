package leetcode;

import java.util.Arrays;

public class merge_sort_array_000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {};
		int[] nums2 = {1};
		int m = nums1.length;
		int n = nums2.length;
		merge(nums1, m, nums2, n);

	} 

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] nums = new int[m];
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				if (nums1[i] != 0) {
					nums[k] = nums1[i];
					k++;
					i++;
				} else {
					i++;
				}
			} else {
				if (nums2[j] != 0) {
					nums[k] = nums2[j];
					k++;
					j++;
				} else {
					j++;
				}
			}
		}
		while (i < m) {
			if (nums1[i] != 0) {
				nums[k] = nums1[i];
				i++;
				k++;
			} else {
				i++;
			}
		}
		while (j < n) {
			if (nums2[j] != 0) {
				nums[k] = nums2[j];
				k++;
				j++;

			} else {
				j++;
			}
		}
	}

}
