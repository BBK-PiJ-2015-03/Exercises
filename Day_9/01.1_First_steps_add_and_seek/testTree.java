import static org.junit.Assert.*;

import org.junit.Test;

public class testTree {

	@Test
	public void test() {
		
		BinaryTreeNode bt = new BinaryTreeNode();
		
		
		/************************************************
		 * Adding a few random values to the tree
		 ************************************************/
		
		bt.add(60);
		bt.add(32);
		bt.add(62);
		bt.add(50);
		bt.add(102);
		bt.add(209);
		bt.add(34);
		bt.add(75);
		bt.add(11);
		bt.add(86);
		bt.add(43);
		bt.add(98);
		bt.add(58);
		
		
		/************************************************
		 * Printing highest value stored in the tree
		 ************************************************/
		
		System.out.println("The highest number in the tree is " + bt.getMax());
		
		
		/************************************************
		 * Printing lowest value stored in the tree
		 ************************************************/
		
		System.out.println("The lowest number in the tree is " + bt.getMin());
	}
}