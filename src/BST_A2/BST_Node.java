package BST_A2;

public class BST_Node {
	String data;
	BST_Node left;
	BST_Node right;
	
	public BST_Node(String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public String getData() {
		return data;
	}
	public BST_Node getLeft() {
		return left;
	}
	public BST_Node getRight() {
		return right;
	}
	public String toString() {
		return "Data: "+this.data+", Left: "+((this.left!=null)?left.data:"null")
	            +",Right: "+((this.right!=null)?right.data:"null");
	}
}
