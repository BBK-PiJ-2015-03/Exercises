public class LinkedList 
{
	private Node Head;

	void add(Node n)
	{
		if (this.Head == null) 
		{
			this.Head = n;
		} 
		else 
		{
			Node temp = Head;
			while (temp.next != null) 
			{
				temp = Head.next;
			}
			temp.next = n;
		}
	}

	void printList()
	{
		Node temp = Head;
		while (temp.next != null) 
		{
			System.out.println(temp); // the node is printed due to toString() method
			temp = Head.next;
		}
		System.out.println(temp); // the node is printed due to toString() method
			
	}
}