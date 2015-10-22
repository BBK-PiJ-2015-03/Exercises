public class LinkedList {
	Node head;
	Node tail;
	int size;


	public void addNode(Node newNode){
	/** 
	* Add method
	* Head 					     Tail
	*  |					       |
	* Node1 -> Node2 -> Node3 -> Node4
	* 
	*/

	
		if (size == 0){
			head = newNode;
			tail = newNode;
			size++;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public Node previousNode(Node thisNode){
		Node temp = new Node();
		temp = head;
		if (temp.next == thisNode) {
			return temp;
		} else {
			while (temp.next != thisNode) {
				temp = temp.next;
			}
			return temp;
		}
	}

	
	public void printNodes(){

		Node newNode = new Node(); 
		newNode = head;
		System.out.println(newNode);
		while (newNode.next != null){
			System.out.println(newNode.next);
			newNode = newNode.next;
		}
	}




	// Print Method

	// Delete Method

}