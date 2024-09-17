package arrays;

import java.util.Arrays;

public class merge_two_sorted_arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 8};
        int[] arr2 = {2, 3, 6, 9};

        // Merging arr1 and arr2 and printing the result
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    static int[] mergeArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m + n]; // Result array to hold merged arrays
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array

        // Merge arrays until one of them is exhausted
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[k] = nums1[i];
                i++;
                k++;
            } else {
                res[k] = nums2[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements from arr1 (if any)
        while (i < m) {
            res[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2 (if any)
        while (j < n) {
            res[k] = nums2[j];
            k++;
            j++;
        }

        return res;
    }
}
