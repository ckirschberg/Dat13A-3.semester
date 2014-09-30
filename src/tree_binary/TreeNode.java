package tree_binary;

public class TreeNode<T> {
	TreeNode<T> left;
	TreeNode<T> right;
	T name;
	
	public TreeNode(T t)
	{
		name = t;
	}
	public void attachLeft(TreeNode<T> newNode)
	{
		left = newNode;
	}
	
	public void attachRight(TreeNode<T> newNode)
	{
		right = newNode;
	}
}
