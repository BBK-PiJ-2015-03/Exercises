public class LinkedList {
	Node head;
	int size;


	public void addNode(int data){

		Node newNode = new Node(data);
		if (size == 0){
			head = newNode;
			newNode.next = head;
			size++;
		}
		else {
			Node temp = new Node();
			temp = head;
			while (temp.next != head){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
			size++;
		}

	}

	public void printNodes(){

		Node newNode = new Node(); 
		newNode = head;
		System.out.print(newNode);
		while (newNode.next != head){
			System.out.print(newNode.next);
			newNode = newNode.next;
		}
		System.out.println("");

	}



	public boolean del(int data){
		/**
		*Scenario 1: Node at start
		*Scenario 2: Node in middle
		*Scenario 3: Node at end
		*Scenario 4: No nodes in list
		*Scenario 5: Node is the only one in list
		*/

		if (head == null) {
			System.out.println("List is empty.");
			return false;
			//Scenario 4
		}
		
		if (head.data == data){
			System.out.print("DEBUGTEST2");
			head = head.next;
			return true;
		} 
			//Scenario 5 & Scenario 1
		
		Node temp = new Node();
		temp = head;
		while (temp.data != data) {
			if (temp.next != head) {
								System.out.print("DEBUGTEST4");
				temp = temp.next;
			} else {
								System.out.print("DEBUGTEST5");

			return false;
			}
		}
		previousNode(data).next = temp.next;
						System.out.print("DEBUGTEST6");

		return true;
		//Scenario 2
	}

		/**
		* Old method that was not deleting first element of list
		*
		* if (head == null) {
		*	System.out.println("List is empty.");
		*	return false;
		* } else {
		*	Node temp = new Node();
		*	temp = head;
		*	if (head.data == data){
		*		head = head.next;
		*		return true;
		*	}
		*	while (temp.data != data){
		*		if (temp.next == head){
		*			return false;
		*		}
		*
		*		temp = temp.next;
		*	}
		*	if (head == temp) {
		*		head = temp.next;
		*		temp.next = head;
		*		return true;
		*	} else {
		*		previousNode(data).next = temp.next;
		*		return true;
		*	}
		*	// under construction
		* }
		*/


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
}
