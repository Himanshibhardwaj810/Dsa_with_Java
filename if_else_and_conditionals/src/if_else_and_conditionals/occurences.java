package if_else_and_conditionals;

public class occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54587455;
		int rem;
		int count=0;
		while(n>0) {
			rem=n%10;
			if (rem==5) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
		

	}

}
