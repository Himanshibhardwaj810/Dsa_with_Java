package Binary_tree_Shradha;
import java.util.*;


public class Diameter_of_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	//diameter of tree
	//we take separate class that will store height and diameter of each node
	
	//approach o(n)
	public static Tree diameter(Node root) {
		
		if(root==null) {
			return new Tree(0,0);
		}
		
		Tree left=diameter(root.left);
		Tree right=diameter(root.right);
		
		int height=Math.max(left.height,right.height)+1;
		
		int diam1=left.diam;
		int diam2=right.diam;
		int diam3=left.height+right.height+1;
		
		int resultDiam=Math.max(diam1,Math.max(diam2, diam3));
		
		Tree resultTree=new Tree(height,resultDiam);
		return resultTree;
	}
		
	}
	class Tree{
		int height;
		int diam;
		Tree(int height,int diam){
			this.height=height;
			this.diam=diam;	
		}
		
	}
	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	

}
