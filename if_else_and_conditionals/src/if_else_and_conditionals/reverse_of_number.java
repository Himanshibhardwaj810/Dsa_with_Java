package if_else_and_conditionals;

public class reverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=784213;
		System.out.println(n);
		int rem;
		int ans=0;
		while(n>0) {
			rem=n%10;
			ans=ans*10+rem;
			n=n/10;
			
		}
		System.out.println(ans);

	}

}
