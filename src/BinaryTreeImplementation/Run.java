package BinaryTreeImplementation;

public class Run {
	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();		
		Node<Integer> root = new Node<Integer>(60);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(70);
		Node<Integer> node4 = new Node<Integer>(10);
		Node<Integer> node5 = new Node<Integer>(40);
		Node<Integer> node6 = new Node<Integer>(30);
		Node<Integer> node7 = new Node<Integer>(50);
		Node<Integer> node8 = new Node<Integer>(5);
		Node<Integer> node9 = new Node<Integer>(15);
		Node<Integer> node10 = new Node<Integer>(50);
		Node<Integer> node11 = new Node<Integer>(40);
		Node<Integer> node12 = new Node<Integer>(50);
		Node<Integer> node13 = new Node<Integer>(40);
		
		root.attachLeft(node2);
		root.attachRight(node3);
		
		node2.attachLeft(node4);
		node2.attachRight(node5);
		
		node5.attachLeft(node6);
		node5.attachRight(node7);
		
		node7.attachLeft(node8);
		node7.attachRight(node9);
		
		node3.attachLeft(node10);
		node3.attachRight(node11);
		node10.attachRight(node12);
		node11.attachRight(node13);
		
		System.out.println("*************PREORDER*****************");
		tree.printPreorder(root);
		System.out.println("*************POSTORDER*****************");
		tree.printPostorder(root);		
		System.out.println("*************INORDER*****************");
		tree.printInorder(root);
		System.out.println("*************AMOUNT OF NODES*****************");
//		System.out.println(tree.height(root));
//		System.out.println(tree.isBalanced(root));
		System.out.println(tree.numberOfNodes(root));
	}
}
