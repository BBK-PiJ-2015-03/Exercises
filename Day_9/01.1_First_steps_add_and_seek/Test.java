

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.print("Goodbye World!");
		
		BinaryTreeNode bt = new BinaryTreeNode();
		
		bt.add(21);
		bt.add(32);
		bt.add(42);
		bt.add(20);
		bt.add(1);
		bt.add(309);
		
		BinaryTree n = new BinaryTree();
		System.out.println(n.root);
	}

}
