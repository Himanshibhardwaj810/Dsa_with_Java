package Binary_tree;

import java.util.*;

public class Binary_trees {
	private Node root;

	public Binary_trees() {
		this.root=null;

	}

	private static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	// insert elements
	public void insert(Scanner scanner) {
		System.out.println("Enter the root node");
		int value = scanner.nextInt();
		Node root = new Node(value);
		insert(scanner, root);
	}

	public void insert(Scanner scanner, Node node) {
		System.out.println("Do you want to enter the left of " + node.value);
		Boolean left = scanner.nextBoolean();
		if (left) {
			System.out.println("Enter the value of left node");
			int value = scanner.nextInt();
			node.left = new Node(value);
			insert(scanner, node.left);
		}
		System.out.println("Do you want to enter the right of " + node.value);
		Boolean right = scanner.nextBoolean();
		if (right) {
			System.out.println("Enter the value of right node "+node.value);
			int value=scanner.nextInt();
			node.right=new Node(value);
			insert(scanner,node.right);
		}
	}
	
	//Display
	public void display() {
		display(this.root, " ");
	}
	private void display(Node node,String indent) {
		if(node==null) {
			return;
		}
		System.out.println(indent+ node.value);
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
		
	}
}
