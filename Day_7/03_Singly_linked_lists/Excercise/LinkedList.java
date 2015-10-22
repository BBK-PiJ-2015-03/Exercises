public class LinkedList {
	Node head;
	Node tail;
	int size;


	public void addNode(int data){
	/** 
	* Add method
	* Head 					     Tail
	*  |					       |
	* Node1 -> Node2 -> Node3 -> Node4
	* 
	*/

	Node newNode = new Node(data);
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

	public Node previousNode(int data){
		Node temp = new Node();
		temp = head;
		if (temp.data == data) {
			return temp;
		} else {
			while (temp.next.data != data) {
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


	public void del(int data){
		if (size == 0) {
			System.out.println("List is empty.");
		} else {
			// under construction
		}
	}
	// Delete Method

}