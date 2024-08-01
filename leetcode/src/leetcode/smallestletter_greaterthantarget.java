package leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class smallestletter_greaterthantarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int ceiling(int[] letters, int target) {
		int start = 0;
		int end = letters.length - 1;
		//but if the target element is greatest than the last elemnt of array
		
	

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] > target) {
				end = mid - 1;
			} else  {
				start = mid + 1;
			} 
			
		}
		return letters[start%letters.length];//as start=end +1;when condition is violated
		//tehn start=lengthof array
		//we can also do if (start==letters.length)
                                //return 0
	}

}
