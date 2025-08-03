package Binary_tree_Shradha;
import java.util.*;
public class Insertion_and_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	    BinaryTree tree = new BinaryTree();
	    Node root = tree.insertion(nodes);

	    System.out.print("Preorder Traversal: ");
	    tree.Preorder(root);
	    System.out.println();

	    System.out.print("Tree Level Order (BFS):\n");
	    tree.bfsWithLevels(root);

	    System.out.println("Total number of nodes: " + tree.countOfNodes(root));
	    System.out.println("Sum of nodes: " + tree.SumOfNodes(root));
	    System.out.println("Height of tree: " + tree.HeightOfTree(root));
	    System.out.println("Diameter of tree: " + tree.Diameter(root));
	    System.out.println("Diameter of tree(2nd approach): " + tree.diameter2(root).diam);

	}

	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		// Insertion in Binary tree
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
		//BFS
		public static void bfsWithLevels(Node root) {
		    if (root == null) return;

		    Queue<Node> q = new LinkedList<>();
		    q.add(root);
		    q.add(null); // Level marker

		    while (!q.isEmpty()) {
		        Node curr = q.remove();

		        if (curr == null) {
		            System.out.println(); // move to next level
		            if (!q.isEmpty()) {
		                q.add(null); // add level marker
		            }
		        } else {
		            System.out.print(curr.value + " ");
		            if (curr.left != null) q.add(curr.left);
		            if (curr.right != null) q.add(curr.right);
		        }
		    }
		}
		
		//PreOrder traversal
		public static void Preorder(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.value+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
		
		//InOrder traversal
		public static void Inorder(Node root) {
			if(root==null) {
				return;
			}
			Inorder(root.left);
			System.out.print(root.value+" ");
			Inorder(root.right);
		}
		//PostOrder traversal
		public static void Postorder(Node root) {
			if(root==null) {
				return;
			}
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.value+" ");
		}
		
		//count of Nodes
		public static int countOfNodes(Node root) {
			if (root==null) {
				return 0;
			}
			int left=countOfNodes(root.left);
			int right=countOfNodes(root.right);
			
			return left+right+1;
		}
		
		//sum of nodes
		public static int SumOfNodes(Node root) {
			if (root==null) {
				return 0;
			}
			int left=SumOfNodes(root.left);
			int right=SumOfNodes(root.right);
			
			return left+right+root.value;
		}
		
		//Height of tree
		public static int HeightOfTree(Node root) {
			if(root==null) {
				return 0;
			}
			
			int leftTree=HeightOfTree(root.left);
			int rightTree=HeightOfTree(root.right);
			
			int height=Math.max(leftTree, rightTree)+1;
			return height;
		}
		
		//Diameter of tree
		//Diameter is the longest path between any two leaf nodes including
		//root or not
		//approach o(n2)
		
		//Take diam 1=Diameter of left subtree if the max diameter lies in left subtree
		//Take diam 2=Diameter of right subtree if the max diameter lies in right subtree
		//Take diam 3=height of left subtree+height of right subtree +1;
		//maximum of diam1,diam2,diam3 is  the diameter of the tree
		public static int Diameter(Node root) {
			if(root==null) {
				return 0;
			}
			
			int diam1=Diameter(root.left);//left subtree
			int diam2=Diameter(root.right);//right subtree
			int diam3=HeightOfTree(root.left)+HeightOfTree(root.right)+1;
			
			return Math.max(diam1, Math.max(diam2, diam3));
		}
		

		//diameter of tree
		//we take separate class that will store height and diameter of each node
		
		//approach o(n)
		public static Tree diameter2(Node root) {
			
			if(root==null) {
				return new Tree(0,0);
			}
			
			Tree left=diameter2(root.left);
			Tree right=diameter2(root.right);
			
			int height=Math.max(left.height,right.height)+1;
			
			int diam1=left.diam;
			int diam2=right.diam;
			int diam3=left.height+right.height+1;
			
			int resultDiam=Math.max(diam1,Math.max(diam2, diam3));
			
			Tree resultTree=new Tree(height,resultDiam);
			return resultTree;
		}
			
		
		static class Tree{
			int height;
			int diam;
			Tree(int height,int diam){
				this.height=height;
				this.diam=diam;	
			}
			
		}

	}

}
