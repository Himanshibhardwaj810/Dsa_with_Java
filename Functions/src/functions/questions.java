package functions;

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		System.out.println(isPrime(n));
//		System.out.println(armstrong(n));
		
		
		//100 prime numbers
		for(int m=1;m<101;m++) {
			if(isPrime(m)) {
				System.out.print(m+ " ");
			}
		}
		
		
		// 3-digit armatrong numbers
		for (int k=100;k<1000;k++) {
			if(armstrong(k)){
				System.out.println(k);
			}
		}
		
	
	

	}

	static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		if (i * i >= n) {
			return true;
		} else {
			return false;
		}

	}
	
	static boolean armstrong(int n) {
		int original=n;
		int rem;
		int sum=0;
		while(n>0) {
			rem=n%10;
			
			sum=rem*rem*rem+sum;
			n=n/10;	
			
		}
//		return sum==original;
		if (sum==original) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
