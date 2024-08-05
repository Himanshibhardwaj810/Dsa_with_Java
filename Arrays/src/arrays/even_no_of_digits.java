package arrays;

public class even_no_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 5435, 7895, 1, 4, 4 };
		System.out.println(findnumbers(arr));
		System.out.println(digit(54545));
		System.out.println(digit2(5454545));

	}

	// to find how many no are even
	static int findnumbers(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (even(element)) {
				count++;//it return the no of elements that are even
			}
		}
		return count;

	}

	// to find the no is even or not
	static boolean even(int element) {
		int digits = digit(element);
		if (digits % 2 == 0) {
			return true;//it return whether the no of digit is even
		}
		return false;
	}

	// to find the no of digits the element in array contain
	static int digit(int element) {
		// edge cases
		// if number is negative
		if (element < 0) {
			element = element * -1;
		}
		// if number is zero
		if (element == 0) {
			return 1;
		}
		int count = 0;
		while (element > 0) {
			count++;
			element = element / 10;

		}
		return count;//it returns the no of digit in element of arr
	}

	// another way to find digits
	static int digit2(int element) {
		// edge cases
		// if number is negative
		if (element < 0) {
			element = element * -1;
		}
		return (int) (Math.log10(element)) + 1;
	}

}
