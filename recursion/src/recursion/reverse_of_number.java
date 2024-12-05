package recursion;

public class reverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(4512);
		System.out.println(rev2(4321));
		System.out.println(sum);

	}
	//1st way
	static int sum=0;
	
	static void reverse(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		reverse(n/10);
		
	}
	// 2nd method
	
	//when we Need additional variables in the arguments then
	//we make a new function 
	static int rev2(int n) {
		int digits=(int)(Math.log10(n)+1);//it returns no of digits
		System.out.println(digits+"hjb");
		return helper(n,digits);
	}
	static int helper(int n, int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem*(int)Math.pow(10, digits-1)+helper(n/10,digits-1);
	}

}
