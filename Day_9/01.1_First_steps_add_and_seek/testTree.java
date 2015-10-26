public class testTree {

	public static void main (String args[])	{
		
		
		
		/************************************************
		 * Adding a few random values to the tree
		 ************************************************/
		
		BinaryTreeNode bt = new BinaryTreeNode(6);
		bt.add(5);
		bt.add(9);
		bt.add(3);
		bt.add(8);
		bt.add(11);
		bt.add(12);
		
		
		/************************************************
		 * Printing highest value stored in the tree
		 ************************************************/

		System.out.println("");
		System.out.println("The highest number in the tree is " + bt.getMax());
		
		
		/************************************************
		 * Printing lowest value stored in the tree
		 ************************************************/

		System.out.println("");
		System.out.println("The lowest number in the tree is " + bt.getMin());
		
		
		/************************************************
		 * Printing out a representation of the tree
		 ************************************************/
		System.out.println("");

		System.out.println("Complex representation of the tree");	
		System.out.println(bt.toString());	

		System.out.println("");
		
		System.out.println("Simple representation of the tree");;
		System.out.println(bt.toStringSimple());
		
		
		/************************************************
		 * Printing out the number of levels in the tree
		 ************************************************/
		System.out.println("");
		System.out.println("The number of levels in this tree is " + bt.depth());
		
		

		/************************************************
		 * Testing previous node method
		 ************************************************/
		System.out.println("");
		System.out.println("Previous node to node[5] is node[" + bt.previousNode(5).getValue() + "]");
		


		/************************************************
		 * Checking if tree contains target node
		 ************************************************/
		System.out.println("");
		System.out.print("Does tree contain node[3]: ");
		if (!bt.contains(3)){
			System.out.print("No");
		} else {
			System.out.print("Yes");
		}
		
		
		/************************************************
		 * Remove a targeted node from the tree
		 ************************************************/
		System.out.println("");
		System.out.println("Representation of the tree before node[6] removal");
		System.out.println(bt.toStringSimple());
		System.out.println("");
		bt.remove(6);
		System.out.println("Representation of the tree after node[6] removal");
		System.out.println(bt.toStringSimple());
		System.out.println("");
		
		System.out.println("Representation of the tree before node[11] removal");
		System.out.println(bt.toStringSimple());
		System.out.println("");
		bt.remove(11);
		System.out.println("Representation of the tree after node[11] removal");
		System.out.println(bt.toStringSimple());
		
	}
}