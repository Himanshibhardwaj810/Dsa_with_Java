package stack;
import java.util.Stack;

public class tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Stack<Integer> source=new Stack<>();
		Stack<Integer> aux=new Stack<>();
		Stack<Integer> dest=new Stack<>();
		
		for(int i=n;i>=1;i--) {
			source.push(i);
		}
		
		towerofhanoi(n,source,aux,dest);
		

	}
	static void towerofhanoi(int n,Stack<Integer>source,Stack<Integer>aux,Stack<Integer>dest) {
		if(n==1) {
			int disk=source.pop();
			dest.push(disk);
			System.out.println(disk);
			return;
		}
		
		towerofhanoi(n-1,source,dest,aux);
		int disk=source.pop();
		dest.push(disk);
		System.out.println(disk);
		towerofhanoi(n-1,aux,source,dest);
	}

}
