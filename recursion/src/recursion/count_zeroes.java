package recursion;

public class count_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countzeroes(30205));

	}
	//special pattern how to pass a value to another calls
	static int countzeroes(int n) {
		return helper(n,0);
	}
	static int helper(int n,int count) {
		if(n==0) {
			return count;
		}
		
		int rem=n%10;
		if(rem==0) {
			return helper(n/10,count+1);
		}else {
			return helper(n/10,count);
		}
		
	}

}
