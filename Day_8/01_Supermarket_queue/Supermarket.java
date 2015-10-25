public class Supermarket implements PersonQueue
{
	Person head;
	Person tail;

	public void insert(Person person){
		if (head == null){
			head = person;
			tail = person;
			System.out.println(person.name + ", aged " + person.age + " is the first to join the que.");
		} else {
			tail.next = person;;
			tail = person;
			System.out.println(person.name + ", aged " + person.age + " has joined the que.");
		}
	}
	
	public Person retrieve(){
		if (head == null) {
			System.out.print("List is empty");
			return null;
		} else {
			Person temp = head;
			System.out.println(temp.name + ", aged " + temp.age + " is the next person in the que.");
			return temp;
		}
	}

	public Person servePerson(){
		if (head == null) {
			System.out.println("The que is empty, no one to serve.");
			return null;
		} else {
			Person temp = head;
			head = head.next;
			System.out.println(temp.name + ", aged " + temp.age + " has been served");
			return temp;
		}
	}


}
