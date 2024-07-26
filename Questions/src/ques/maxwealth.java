package ques;

public class maxwealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(wealth(arr));
	}
	static int wealth(int[][] arr) {
		
		int max=0;
		for(int cus=0;cus<arr.length;cus++) {
		//for every cus
			int wealth=0;//after completion of one row the value again should be zero
			for(int money=0;money<arr[cus].length;money++) {
				wealth=wealth+arr[cus][money];
			}
			
			if(wealth>max) {
				max=wealth;
				
			}
			
		}
		return max;
		
	}
//	static int maxwealth(int wealth) {
//		
//	}

}
