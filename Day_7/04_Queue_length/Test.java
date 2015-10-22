public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();

		System.out.println("Adding 6 nodes.");
	
		L.addNode(22);
		L.addNode(34);
		L.addNode(64);
		L.addNode(16);
		L.addNode(100);
		L.addNode(9);

		System.out.println("Queue Length: " + L.size);
		System.out.println("");

		L.addNode(22);
		L.addNode(121);
		L.addNode(11);
		L.addNode(3);
		System.out.println("Adding 4 nodes.");

		System.out.println("Queue Length: " + L.size);
		System.out.println("");

		L.del(3);
		L.del(22);
		System.out.println("Deleting 2 nodes.");

		System.out.println("Queue Length: " + L.size);
		System.out.println("");

				

	}

}