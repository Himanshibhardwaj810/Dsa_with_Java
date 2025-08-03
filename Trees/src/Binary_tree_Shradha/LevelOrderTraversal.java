package Binary_tree_Shradha;
import java.util.*;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree=new BinaryTree();
		Node root=tree.insertion(nodes);
		tree.Bfs(root);

	}
	
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	//Bfs is same as level order traversal as it is implemented using queue
	static class BinaryTree{
		static int index = -1;

		public static Node insertion(int nodes[]) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = insertion(nodes);
			newNode.right = insertion(nodes);
			return newNode;
		}
		public static void Bfs(Node root) {
			if(root==null) {
				return;//if the root is initally null
			}
			Queue<Node>q=new LinkedList<>();
			q.add(root);//adding root in initial stage
			q.add(null);//here null represents new line 
			while(!q.isEmpty()) {
				Node currNode=q.remove();
				if(currNode==null) {//if currNode null then we have to print next line
					System.out.println();//next line represents next level
					if(q.isEmpty()) {
						return;
					}else {
						q.add(null);
					}
				}else {
					System.out.println(currNode.value+" ");
					if(currNode.left!=null) {
						q.add(currNode.left);
					}
					if(currNode.right!=null) {
						q.add(currNode.right);
					}
				}
				
			}
			
		}
	}

}
