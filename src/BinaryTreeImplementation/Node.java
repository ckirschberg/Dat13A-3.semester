package BinaryTreeImplementation;

public class Node<T> {
	Node<T> left;
	Node<T> right;
	T name;
	
	public Node(T t) {
		name = t;
	}
	
	public void attachLeft(Node<T> newNode) {
		left = newNode;
	}
	
	public void attachRight(Node<T> newNode) {
		right = newNode;
	}
}
