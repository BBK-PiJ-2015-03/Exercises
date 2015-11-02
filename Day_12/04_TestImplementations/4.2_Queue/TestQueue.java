import org.junit.*;
import static org.junit.Assert.*;

public class TestQueue{


	@Test
	public void testCreatePerson(){
		Supermarket test = new Supermarket();
		Person jim = new Person("jim", 12);
		String expected = "jim 12";
		String output = jim.name + " " + jim.age;
		assertEquals(expected, output);
	}

	@Test
	public void testInsert(){
		Supermarket test = new Supermarket();
		Person jim = new Person("jim", 12);
		test.insert(jim); 
	}

	@Test
	public void testInsertStress(){
		Supermarket test = new Supermarket();
		Person ted = new Person("Ted", 52);
		for(int i = 0; i < 1000; i++){
			test.insert(ted); 
		}
	}

	@Test
	public void testRetrieveEmptyQueue(){
		Supermarket test = new Supermarket();
		assertNull(test.retrieve());
	}

	@Test
	public void testRetrieveQueue(){
		Supermarket test = new Supermarket();
		Person jim = new Person("jim", 12);
		test.insert(jim); 
		assertNotNull(test.retrieve());
	}



}