package Binary_tree_Shradha;

public class Insertion_and_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree=new BinaryTree();
		Node root=tree.insertion(nodes);
		tree.Preorder(root);

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
		
		//PreOrder traversal
		public static void Preorder(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.value+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
		
		//PreOrder traversal
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

	}

}
