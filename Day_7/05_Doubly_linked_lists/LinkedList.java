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
			newNode.prev = previousNode(data);
			tail = newNode;
			size++;
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

	
	public void transverseForward(){

		Node newNode = new Node(); 
		newNode = head;
		System.out.println(newNode);
		while (newNode.next != null){
			System.out.println(newNode.next);
			newNode = newNode.next;
		}
	}

	public void transverseBackward(){

		Node newNode = new Node(); 
		newNode = tail;
		System.out.println(newNode);
		while (newNode.prev != null){
			System.out.println(newNode.prev);
			newNode = newNode.prev;
		}
	}


	public boolean del(int data){
		if (size == 0) {
			System.out.println("List is empty.");
			return false;
		} else {
			Node temp = new Node();
			temp = head;
			while (temp.data != data){
				temp = temp.next;
			}
			if (tail == temp){
				tail = previousNode(data);
				previousNode(data).next = null;
				size--;
				return true;
			} else {
				if (head == temp) {
					head = temp.next;
					temp.next = null;
					size--;
					return true;
				} else {
					previousNode(data).next = temp.next;
					size--;
					return true;
				}
			}
			// under construction
		}
	}
	// Delete Method

}