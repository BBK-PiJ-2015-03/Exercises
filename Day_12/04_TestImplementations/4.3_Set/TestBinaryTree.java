import org.junit.*;
import static org.junit.Assert.*;

public class TestBinaryTree {

	@Test
	public void testAdd(){
		BinaryTreeNode bt = new BinaryTreeNode(6);
		bt.add(4);
		String output = "" + bt.getLeft().getValue();
		String expected = "4";
		assertEquals(expected, output);
	}

	@Test
	public void testStressAdd(){
		/**
		* Test add up to 999 items
		* Also test the getMax() method but not thoroughly.
		*/
		BinaryTreeNode bt = new BinaryTreeNode(6);
		for (int i = 8; i < 1000; i++){
			bt.add(i);
			assertEquals("failed at "+i,i, bt.getMax());
		}
		String output = "" + bt.getMax();
		String expected = "999";
		assertEquals("Test note ",expected, output);
	}	

	@Test
	public void testGetMax(){
		BinaryTreeNode bt = new BinaryTreeNode(4);
		assertEquals("Failed at point 1", 4, bt.getMax());
		bt.add(1);
		assertEquals("Failed at point 2", 4, bt.getMax());
		bt.add(8);
		assertEquals("Failed at point 3", 8, bt.getMax());
		bt.add(99);
		bt.add(84);
		bt.add(83);
		bt.add(87);
		bt.add(85);
		bt.add(85);
		bt.add(48);
		bt.add(28);
		bt.add(18);
		assertEquals("Failed at point 4", 99, bt.getMax());
		bt.add(100);
		bt.add(100);
		bt.add(100);
		bt.add(100);
		bt.add(100);
		bt.add(101);
		bt.add(100);
		bt.add(100);
		bt.add(100);
		assertEquals("Failed at point 5", 101, bt.getMax());
	}

	@Test
	public void testGetMin(){
		BinaryTreeNode bt = new BinaryTreeNode(4);
		assertEquals("Failed at point 1", 4, bt.getMax());
		bt.add(3);
		assertEquals("Failed at point 2", 3, bt.getMax()); // Failing at this point
		bt.add(8);
		assertEquals("Failed at point 3", 3, bt.getMax());
		bt.add(99);
		bt.add(84);
		bt.add(2);
		bt.add(87);
		bt.add(85);
		bt.add(85);
		bt.add(48);
		bt.add(28);
		bt.add(18);
		assertEquals("Failed at point 4", 2, bt.getMax());
		bt.add(-100);
		bt.add(-100);
		bt.add(-100);
		bt.add(-100);
		bt.add(-100);
		bt.add(-101);
		bt.add(-100);
		bt.add(-100);
		bt.add(-100);
		assertEquals("Failed at point 5", -101, bt.getMax());
	}


}