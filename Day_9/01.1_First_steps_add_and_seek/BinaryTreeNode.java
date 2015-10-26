
public class BinaryTreeNode {
	int value;
	BinaryTreeNode right;
	BinaryTreeNode left;
	
	public BinaryTreeNode(int value){
		this.value = value;
		right = null;
		left = null;
	}
	
	public BinaryTreeNode() {
	}

	public void add(int newNumber){
		BinaryTree n = new BinaryTree();
		BinaryTreeNode newNode = new BinaryTreeNode(newNumber);
		
		if (n.root == null){
			n.root = newNode;
		} else {
			if (newNumber > this.value){
				if (right == null){
					right = new BinaryTreeNode(newNumber);
				} else {
					right.add(newNumber);
				}
			} else {
				if (left == null){
					left = new BinaryTreeNode(newNumber);
				} else {
					left.add(newNumber);
				}
			}
		}
	}
}
