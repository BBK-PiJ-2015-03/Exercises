public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();
		
//1. Create the circular list and add several elements to it (around 10 is fine).
		L.addNode(22);
		L.addNode(34);
		L.addNode(64);
		L.addNode(16);
		L.addNode(100);
		L.addNode(9);
		L.addNode(14);
		L.addNode(101);
		L.addNode(38);
		L.addNode(90);

// 2. Traverse it forwards for one complete loop. While you go around the list, print out the content of each element.
// How do you know that you have reached the end of the list when you never find a null pointer?
// Answer: I have stopped the loop when node.next = head, rather than node.next = null.
		System.out.println("Print full list:");
		L.printNodes();

// 3. Delete a couple of elements from the list
		System.out.println("Deleting node(22) - START OF LIST");		
		if (!L.del(22)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("...Deleted.");
		}

		System.out.println("");
		System.out.println("Print full list:");	
		L.printNodes();
		System.out.print("");


		System.out.println("Deleting node(64) - MIDDLE OF LIST");		
		if (!L.del(64)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("...Deleted.");
		}

		System.out.println("");
		System.out.println("Print full list:");	
		L.printNodes();
		System.out.print("");
		
		System.out.println("Deleting node(90) - END OF LIST");		
		if (!L.del(90)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("...Deleted.");
		}
		System.out.println("");

//4. Traverse it again printing out the content of each element.
		System.out.println("Print full list:");	
		L.printNodes();
		System.out.println("");
	
//5. Add a new element to the list. Try to delete an element that is NOT in the list.
		L.addNode(999);

		System.out.println("Deleting node(1) - NOT IN the LIST");		
		if (!L.del(90)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("...Deleted.");
		}

//6. Traverse it again printing out the content of each element.
		System.out.println("");
		System.out.println("Print full list:");	
		L.printNodes();
		System.out.print("");

	}

}