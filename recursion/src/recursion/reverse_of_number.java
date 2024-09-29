package recursion;

public class reverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(4512);
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

}
