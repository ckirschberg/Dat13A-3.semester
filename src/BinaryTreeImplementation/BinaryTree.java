package BinaryTreeImplementation;
public class BinaryTree<T> {
	
	public void printPreorder (Node<T> incNode) {	
		if (incNode == null) {
			return;
		}
		System.out.println(incNode.name);
		printPreorder(incNode.left);			
		printPreorder(incNode.right);
	}
	
	public void printPostorder (Node<T> incNode) {
		if (incNode == null) {
			return;
		}		
		printPostorder(incNode.left);			
		printPostorder(incNode.right);
		System.out.println(incNode.name);
	}
	
	public void printInorder (Node<T> incNode) {
		if (incNode == null) {
			return;
		}		
		printInorder(incNode.left);			
		System.out.println(incNode.name);
		printInorder(incNode.right);
	}
	
	public int numberOfNodes(Node<T> rootNode){
		if (rootNode == null) {
			return 0;
		}
		  int nodes = 1;                                      
		  nodes = nodes + numberOfNodes(rootNode.right);       
		  nodes = nodes + numberOfNodes(rootNode.left);       
		  return nodes;
	}
	
	public int height(Node<T> rootNode){
		   if(rootNode == null )
		       return 0;
		   return 1 + Math.max(height(rootNode.left), height(rootNode.right));
	}
	
	public boolean isBalanced(Node<T> rootNode) {
		if (rootNode == null) {
			return false;
		}
		int mid = Math.abs(height(rootNode.left) - height(rootNode.right));
		return (mid < 2);
	}	
}
