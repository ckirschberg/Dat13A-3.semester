package tree_binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void test() {
		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
		
		node1.attachLeft(node2);
		node1.attachRight(node7);
		
		node2.attachLeft(node3);
		node2.attachRight(node4);
		
		node4.attachLeft(node5);
		node4.attachRight(node6);
		
		
		
	}

}
