package arrays;

public class kadanes_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,-2,5};
		System.out.println(kandanesalgo(arr));
		

	}
	static int kandanesalgo(int[] arr) {
		int current_sum=arr[0];//=0;
		int max_sum=arr[0];
		for(int i=1;i<arr.length;i++) {//i=0
			current_sum=current_sum+arr[i];
			if(current_sum<arr[i]) {
				current_sum=arr[i];
			}
			if(current_sum>max_sum) {
				max_sum=current_sum;
			}
		}
		return max_sum;
		
	}

}
