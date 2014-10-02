package BinaryTreeImplementation;

import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryTreeTest {
	
	@Test
	public void test_prints() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		Node<Integer> root = new Node<Integer>(60);
		Node<Integer> rootLeft = new Node<Integer>(20);
		Node<Integer> rootRight = new Node<Integer>(70);
		Node<Integer> rootLeftLeft = new Node<Integer>(10);
		Node<Integer> rootLeftRight = new Node<Integer>(30);
				
		root.attachLeft(rootLeft);
		root.attachRight(rootRight);		
		rootLeft.attachLeft(rootLeftLeft);
		rootLeft.attachRight(rootLeftRight);
		System.out.println("**************In Order****************");
		tree.printInorder(root);
		System.out.println("*************Post order*****************");
		tree.printPostorder(root);
		System.out.println("**************Pre order****************");
		tree.printPreorder(root);
		
	}

	@Test
	public void test_numberOfNodes() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		Node<Integer> root = new Node<Integer>(60);
		Node<Integer> rootLeft = new Node<Integer>(20);
		Node<Integer> rootRight = new Node<Integer>(70);
		Node<Integer> rootLeftLeft = new Node<Integer>(10);
		Node<Integer> rootLeftRight = new Node<Integer>(30);
				
		root.attachLeft(rootLeft);
		root.attachRight(rootRight);		
		rootLeft.attachLeft(rootLeftLeft);
		rootLeft.attachRight(rootLeftRight);
		assertEquals("Korrekt", 5, tree.numberOfNodes(root));
		
		Node<Integer> rootLeftLeftLeft = new Node<Integer>(25);
		Node<Integer> rootLeftLeftRight = new Node<Integer>(35);
		rootLeftLeft.attachLeft(rootLeftLeftLeft);
		rootLeftLeft.attachRight(rootLeftLeftRight);
		assertEquals("Korrekt", 7, tree.numberOfNodes(root));
	}
	
	@Test
	public void test_height() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		Node<Integer> root = new Node<Integer>(60);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(70);
		Node<Integer> node4 = new Node<Integer>(10);
		Node<Integer> node5 = new Node<Integer>(40);
		
		root.attachLeft(node2);
		root.attachRight(node3);	
		node2.attachLeft(node4);
		node2.attachRight(node5);	

		assertEquals("Korrekt", 3, tree.height(root));
		Node<Integer> node6 = new Node<Integer>(45);
		Node<Integer> node7 = new Node<Integer>(20);
		node5.attachLeft(node6);
		node5.attachRight(node7);
		assertEquals("Korrekt", 4, tree.height(root));		
	}
	
	@Test
	public void test_isBalanced() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		Node<Integer> root = new Node<Integer>(60);
		Node<Integer> rootLeft = new Node<Integer>(20);
		Node<Integer> rootRight = new Node<Integer>(70);
		Node<Integer> node4 = new Node<Integer>(10);
		Node<Integer> node5 = new Node<Integer>(40);
		
		root.attachLeft(rootLeft);
		root.attachRight(rootRight);	
		rootLeft.attachLeft(node4);
		rootLeft.attachRight(node5);	

		assertEquals("Korrekt", true, tree.isBalanced(root));
		Node<Integer> node6 = new Node<Integer>(10);
		Node<Integer> node7 = new Node<Integer>(40);
		node5.attachLeft(node6);
		node5.attachRight(node7);
		assertEquals("Korrekt", false, tree.isBalanced(root));
		Node<Integer> node8 = new Node<Integer>(10);
		Node<Integer> node9 = new Node<Integer>(40);
		node7.attachLeft(node8);
		node7.attachRight(node9);
		assertEquals("Korrekt", false, tree.isBalanced(root));
	}
}
