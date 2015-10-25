public class Person
{
	public String name;
	public int age;
	public Person next;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void addPerson(Person person) {
		if (this.next == null) {
			this.next = person;
		} else {
			Supermarket s = new Supermarket();
			Person temp = s.head;
			while(this.next != null){
				temp = temp.next;
			}		
			temp.next = person;
		}
	}

}
