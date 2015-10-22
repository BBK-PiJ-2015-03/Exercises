public class Test {

	public static void main(String[] args) {

		LinkedList L = new LinkedList();
		
		Node fNode = new Node(21);
		L.addNode(fNode);
		Node sNode = new Node(53);
		L.addNode(sNode);
		Node tNode = new Node(35);
		L.addNode(tNode);
		Node frNode = new Node(55);
		L.addNode(frNode);

		System.out.println("Print full list:");
		L.printNodes();
		System.out.println("Print node prior to tNode(35)");
		System.out.println(L.previousNode(tNode));

	}

}