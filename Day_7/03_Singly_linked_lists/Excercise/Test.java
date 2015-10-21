public class Test {
	public static void main(String[] args) {
		LinkedList L = new LinkedList();

		Node n1 = new Node();
		n1.n = 1;
		n1.next = null;
		L.add(n1);
		
		Node n2 = new Node();
		n2.n = 2;
		n2.next = null;
		L.add(n2);

		L.printList();

	}
}