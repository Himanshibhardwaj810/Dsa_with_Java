package arrays;

public class Union_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3,4,7 };
		int[] arr2 = { 3, 4, 7,8 };
		findunion(arr1, arr2);
		intersection(arr1,arr2);

	}
	//find union

	static void findunion(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr1[j]);
				j++;
			} else {
				System.out.print(arr1[i]);
				i++;
				j++;
			}
		}
		while (i < arr1.length) {
			System.out.print(arr1[i] + " ");
			i++;
		}

		// Print remaining elements of arr2
		while (j < arr2.length) {
			System.out.print(arr2[j] + " ");
			j++;
		}
		System.out.println();
	}
	//find intersection
	static void intersection(int[]arr1,int[]arr2) {
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
		}
	}
	

	
}
