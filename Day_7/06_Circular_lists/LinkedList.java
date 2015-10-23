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
		if (size == 0) {
			System.out.println("List is empty.");
			return false;
		} else {
			Node temp = new Node();
			temp = head;
			while (temp.data != data){
				if (temp.next == head){
					return false;
				}

				temp = temp.next;
			}
			if (head == temp) {
				head = temp.next;
				temp.next = head;
				return true;
			} else {
				previousNode(data).next = temp.next;
				return true;
			}
			// under construction
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
}
