public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode right;
	private BinaryTreeNode left;
	
	public BinaryTreeNode(int value){
		this.value = value;
		right = null;
		left = null;
	}
	
	public int depth(){
		int countLeft = 0, countRight = 0;
		if (left == null && right == null){
			return 0;
		} 
		if (left != null){
			countLeft = 1 + left.depth();
		}
		if (right != null){
			countRight = 1 + right.depth();
		}
		if (countRight >= countLeft) {
			return countRight;
		} else {
			return countLeft;
		}
	}
	
	public String toString(){
		return "[" + printTree() + "]";
	}
	
	public String printTree(){
		String str = "" + value;
		if (left == null){
			str += " L[] ";
		} else {
			str += " L[" + left.printTree() + "]"; 
		}
		if (right == null){
			str += " R[]";
		} else {
			str += " R[" + right.printTree() + "]"; 
		}
		return "" + str + "";

	}
	
	public String toStringSimple(){
		return "[" + printSimpleTree() + "]";
	}
	
	public String printSimpleTree(){
		String str = "" + value;
		if (left != null){
			str += " [" + left.printSimpleTree() + "]"; 
		}
		if (right != null){
			str += " [" + right.printSimpleTree() + "]"; 
		}
		return "" + str + "";

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
		if (this.left == null){
			return this.value;
		} else {	
			BinaryTreeNode holder = left;
			while (holder.left != null) {
				holder = holder.left;
			}
			return holder.value;
		}
	}
	
}