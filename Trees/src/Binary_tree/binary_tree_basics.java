package Binary_tree;
import java.util.*;
public class binary_tree_basics {
	
	//inorder traversal
	static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
		
	}
	//preorder traversal 
	static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
	//postorder traversal
	static void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}
	
	
	
	//insertion
	static Node insert(Node root,int value) {
	
		if(root==null) {
			return new Node(value);
		}
		if(root.value==value) {
			return root;
		}
		if(value<root.value) {
			root.left=insert(root.left,value);
		}else  {
			root.right=insert(root.right,value);
		}
		return root;
	}
	//maximum depth of tree
	public static int maxdepth(Node root) {
		if(root==null) {
			return 0;
		}
		int leftdepth=maxdepth(root.left);
		int rightdepth=maxdepth(root.right);
		return Math.max(leftdepth, rightdepth)+1;
	}
	//tree is balanced or not
	public static int checkheight(Node root) {
		if(root==null) {
			return 0;
		}
		int leftdepth=checkheight(root.left);
		int rightdepth=checkheight(root.right);
		//if the tree is unbalaced
		if(leftdepth==-1||rightdepth==-1|| Math.abs(leftdepth-rightdepth)>1) {
			return -1;
		}
		return Math.max(leftdepth, rightdepth)+1;
	}
	static boolean isbalanced(Node root) {
		if(checkheight(root) != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static class Node{
		int value;
		Node left;
		Node right;
		public Node(int value) {
			this.value = value;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		root=insert(root,100);
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,30);
		root=insert(root,500);
		root=insert(root,250);
		root=insert(root,600);
		inorder(root);
		System.out.println("preorder");
		preorder(root);
		System.out.println("postorder");
		postorder(root);
		System.out.println("maximum depth of tree ");
		System.out.println(maxdepth(root));
		System.out.println();
		System.out.println(isbalanced(root));

	}

}
