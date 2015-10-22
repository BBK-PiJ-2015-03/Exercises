public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();
		
		L.addNode(22);
		L.addNode(34);
		L.addNode(64);
		L.addNode(16);
		L.addNode(100);
		L.addNode(9);

		System.out.println("Print full list:");
		L.printNodes();
		
		System.out.println("Delete node(64)");		
		if (!L.del(64)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("Deleted.");
		}


		System.out.println("Print full list:");	
		L.printNodes();

		

		System.out.println("Delete node(22)");		
		if (!L.del(22)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("Deleted.");
		}
		
		
		System.out.println("Print full list:");	
		L.printNodes();

		System.out.println("Delete node(9)");		
		if (!L.del(9)) {
			System.out.println("Not Found! Nothing Deleted.");	
		} else {
			System.out.println("Deleted.");
		}
		System.out.println("Deleted.");		
		System.out.println("Print full list:");	
		L.printNodes();
	
		

	}

}