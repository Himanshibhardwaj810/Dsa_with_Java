package stack;
import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack();
		stack.push(45);
		stack.push(145);
		stack.push(245);
		stack.push(345);
		stack.push(445);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
