package BST_A2;

public interface BST_Interface {
	public boolean insert(String str);
	public boolean remove(String str);
	public boolean contains(String str);
	public String findMin();
	public String findMax();
	public int size();
	public boolean empty();
	public int height();
	public BST_Node getRoot();
}
