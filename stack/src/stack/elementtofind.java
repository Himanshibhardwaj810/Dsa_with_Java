package stack;
import java.util.Stack;
public class elementtofind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		int find=1;
		System.out.println(find(stack,find));

	}
	static boolean find(Stack<Integer>stack,int find) {
//		int position=0;
		while(!stack.isEmpty()) {
			int current=stack.pop();
//			position++;
			if(current==find) {
				return true;
			}
			
		}
		return false;
	}
	

}
