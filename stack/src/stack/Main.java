package stack;

public class Main {

	public static void main(String[] args) throws StackException{
		// TODO Auto-generated method stub
		Custom_Stack stack=new Custom_Stack(5);
		stack.push(45);
		stack.push(145);
		stack.push(245);
		stack.push(345);
		stack.push(445);
		stack.push(445);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		DynamicStack dstack=new DynamicStack(3);
		System.out.println("Dynamic Stack");
		stack.push(45);
		stack.push(145);
		stack.push(245);
		stack.push(545);
		//545 is inserted 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		Custom_Stack stackcd=new DynamicStack(2);
		System.out.println("Custom stack access Dynamic Stack");
		stack.push(45);
		stack.push(145);
		stack.push(245);
		stack.push(545);
		//545 is inserted 
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
