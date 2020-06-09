package BST_A2;

public class BST implements BST_Interface {
	private BST_Node root;
	public int size = 0;

	@Override
	public boolean insert(String str) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = new BST_Node(str);
			size += 1;
			return true;
		} else {
			BST_Node node = new BST_Node(str);
			BST_Node parent = null;
			BST_Node current = root;
			while (current != null) {
				parent = current;
				if (str.compareTo(current.data) < 0) {
					current = current.left;
				} else if (str.compareTo(current.data) > 0) {
					current = current.right;
				} else {
					return false;
				}
			}
			if (str.compareTo(parent.data) < 0) {
				parent.left = node;
			} else {
				parent.right = node;
			}
			size += 1;
			return true;
		}
	}

	@Override
	public boolean remove(String str) {
		// TODO Auto-generated method stub
		if (contains(str)) {
			size -= 1;
			return remove(root, str) != null;
		} else {
			return false;
		}
	}

	public BST_Node remove(BST_Node n, String str) {
		if (n == null) {
			return null;
		}
		if (str.compareTo(n.data) < 0) {
			n.left = remove(n.left, str);
		} else if (str.compareTo(n.data) > 0) {
			n.right = remove(n.right, str);
		} else {
			if (n.left != null && n.right != null) {
				BST_Node minRight = findMin(n.right);
				n.data = minRight.data;
				n.right = remove(n.right, minRight.data);
			} else if (n.left != null) {
				n = n.left;
			} else if (n.right != null) {
				n = n.right;
			} else {
				n = null;
			}
		}
		return n;
	}

	@Override
	public boolean contains(String str) {
		// TODO Auto-generated method stub
		return contains(root, str);
	}

	private boolean contains(BST_Node n, String str) {
		if (n == null) {
			return false;
		}
		int compare = str.compareTo(n.data);
		if (compare < 0) {
			return contains(n.left, str);
		} else if (compare > 0) {
			return contains(n.right, str);
		} else {
			return true;
		}
	}

	@Override
	public String findMin() {
		// TODO Auto-generated method stub
		return findMin(root).data;
	}

	private BST_Node findMin(BST_Node n) {
		while (n.left != null) {
			n = n.left;
		}
		return n;
	}

	@Override
	public String findMax() {
		// TODO Auto-generated method stub
		return findMax(root);
	}

	private String findMax(BST_Node n) {
		while (n.right != null) {
			n = n.right;
		}
		return n.data;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

//	public int size(BST_Node n) {
//		if (n == null) {
//			return 0;
//		} else {
//			return 1 + size(n.left) + size(n.right);
//		}
//	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return root == null;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return height(root);
	}

	public int height(BST_Node n) {
		if (n == null) {
			return -1;
		}
		int left = height(n.left);
		int right = height(n.right);

		if (left > right) {
			return left + 1;
		} else {
			return right + 1;
		}
	}

	@Override
	public BST_Node getRoot() {
		// TODO Auto-generated method stub
		return root;
	}
}
