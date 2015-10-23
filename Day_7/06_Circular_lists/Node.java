public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;

	}

	public Node(){
		/**
		* Constructor method to fix error;
		* constructor Node in class Node cannot be applied to given types
		* in method printNodes()
		*/
	}

	public String toString(){
		return " -> " + data;
	}
}