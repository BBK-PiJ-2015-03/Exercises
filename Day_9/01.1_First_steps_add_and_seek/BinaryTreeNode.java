
public class BinaryTreeNode {
	int value = 0;
	BinaryTreeNode right;
	BinaryTreeNode left;
	
	public BinaryTreeNode(int value){
		this.value = value;
		right = null;
		left = null;
	}
	
	public BinaryTreeNode() {
		//empty constructor
	}

	public void add(int newNumber){
		if (newNumber > this.value){
			if (right == null){
				right = new BinaryTreeNode(newNumber);
				System.out.println(newNumber + " has been added to the tree");
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null){
				left = new BinaryTreeNode(newNumber);
				System.out.println(newNumber + " has been added to the tree");
			} else {
				left.add(newNumber);
			}
		}
	}
	
	
	public int getMax(){
		BinaryTreeNode holder = right;
		while (holder.right != null) {
			holder = holder.right;
		}
		return holder.value;
	}

	public int getMin(){
		BinaryTreeNode holder = right;
		while (holder.left != null) {
			holder = holder.left;
		}
		return holder.value;
	}
	
}
