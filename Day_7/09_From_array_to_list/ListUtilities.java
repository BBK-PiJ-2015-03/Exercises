public class ListUtilities {
	int[] listArray;
	int size;
	Node head;
	Node tail;

	public void newArray(int x){
		int[] newArray = new int[x];
		this.listArray = newArray;
		this.size = x;
	}


	public void setArray(int x, int i){
		this.listArray[i] = x;
	}


	public void printArray(){
		for(int i = 0; i < size; i++) {
			System.out.println("Array[" + i + "]: " + listArray[i]);
		}
	}


	public void arrayToList(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void printList(){
		Node newNode = new Node(); 
		newNode = head;
		System.out.print(newNode);
		while (newNode.next != null){
			System.out.print(newNode.next);
			newNode = newNode.next;
		}
	}
}