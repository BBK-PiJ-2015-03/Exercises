public class test {
	
	public static void main (String args[])	{
		
		Supermarket sp = new Supermarket();

		Person firstPerson = new Person("Michelle", 32);
		Person secondPerson = new Person("Donna", 23);

		sp.insert(firstPerson);
		sp.insert(secondPerson);

		sp.retrieve();
		sp.retrieve();

		sp.servePerson();
		sp.servePerson();
		
		
	}
}
