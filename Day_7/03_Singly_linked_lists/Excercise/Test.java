public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();
		
		L.addNode(22);
		L.addNode(34);
		L.addNode(64);
		L.addNode(32);

		System.out.println("Print full list:");
		L.printNodes();
		System.out.println("Print node prior to (64)");
		System.out.println(L.previousNode(64));

	}

}