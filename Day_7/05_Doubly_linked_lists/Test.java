public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();

		//1. Create doubly linked list with 10 elements
		System.out.println("Adding 10 nodes.");
		System.out.println("");
		L.addNode(22);
		L.addNode(34);
		L.addNode(64);
		L.addNode(16);
		L.addNode(100);
		L.addNode(9);
		L.addNode(28);
		L.addNode(121);
		L.addNode(11);
		L.addNode(3);

		
		//2. Transverse if forward and backward printing content of each element
		System.out.println("Transversing Forward & Backward");
		L.transverseForward();
		L.transverseBackward();
		System.out.println("");

		
		//3. Delete a couple of elements from the list
		System.out.println("Deleting Node 100 & Node 3");
		System.out.println("");
		L.del(100);
		L.del(3);

		
		//4. Transverse if forward and backward printing content of each element
		System.out.println("Transversing Forward & Backward");
		L.transverseForward();
		L.transverseBackward();
		System.out.println("");

		
		//5a. Add a new element to the list
		System.out.println("Adding Node 999");
		System.out.println("");
		L.addNode(999);

		
		/**
		* THIS GIVES A NullPointerException error as element
		* 5b. Try to delete an element that is NOT in the list
		* if(!L.del(1000))
		*	System.out.println("Element does not exist, nothing to delete.");
		* else
		*	System.out.println("Element with data field 1000 has been deleted.");
		*/
		
		//4. Transverse if forward and backward printing content of each element
		System.out.println("Transversing Forward & Backward");
		L.transverseForward();
		L.transverseBackward();
		System.out.println("");

				

	}

}