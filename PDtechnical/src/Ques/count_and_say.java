package Ques;

import java.util.Arrays;

public class count_and_say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,2,1,1};
	
		
		int count=1;
		for(int i=0;i<n.length-1;i++) {
			
			if(n[i]==n[i+1]) {
				count++;
				
				System.out.print(count);
			
				System.out.print(n[i]);
				
			}else {
				System.out.print(count);
				System.out.print(n[i]);
			}
		}
		

	}

}
