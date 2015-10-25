public class test {
	
	public static void main (String args[])	{
		
		Supermarket sp = new Supermarket();

		Person firstPerson = new Person("Michelle", 32);
		Person secondPerson = new Person("Donna", 23);
		Person thirdPerson = new Person("Gerald", 55);
		Person fourthPerson = new Person("Harold", 47);


		/***********************************************
		*	Adding 4 people to the que
		************************************************/
		sp.insert(firstPerson);
		sp.insert(secondPerson);
		sp.insert(thirdPerson);
		sp.insert(fourthPerson);

		System.out.println("");


		/***********************************************
		*	Checking who is next in the que
		************************************************/
		sp.retrieve();
		System.out.println("");


		/***********************************************
		*	Serving the next 4 people in the que
		************************************************/
		sp.servePerson();
		sp.servePerson();
		sp.servePerson();
		sp.servePerson();

		/*****************************************************
		*	Serving the next person in the que (que is empty)
		******************************************************/
		
		sp.servePerson();

	}
}
