class Node{
	int key;
	Node left, right;
	
	Node(int item){
		key = item;
		left = right = null;
	}
}
class Simple_TreeTraversal {
	
	Node root;
	Simple_TreeTraversal(){
		root = null;
	}
	
	void printPostorder(Node node){
		if(node == null){
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key+ " ");
	}
	
	void printInorder(Node node){
		if(node == null){
			return;
		}
		printInorder(node.left);
		System.out.print(node.key+ " ");
		printInorder(node.right);
	}
	
	void printPreorder(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.key+ " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	void printPostorder(){
		printPostorder(root);
	}
	void printPreorder(){
		printPreorder(root);
	}
	void printInorder(){
		printInorder(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_TreeTraversal tt = new Simple_TreeTraversal();
		tt.root = new Node(1);
		tt.root.left = new Node(2);
		tt.root.right = new Node(3);
		tt.root.left.left = new Node(4);
		tt.root.left.right = new Node(5);
		
		System.out.println("Preorder traversal of binary tree is: ");
		tt.printPreorder();
		System.out.println("\nInorder traversal of binary tree is: ");
		tt.printInorder();
		System.out.println("\nPostorder traversal of binary tree is: ");
		tt.printPostorder();

	}

}
