import org.junit.*;
import static org.junit.Assert.*;

public class TestPerson{
	
	@Test
	public void testsNameSpaces(){
		/**
		* Tests initial up to 1000 spaces
		* extreme border test
		*/
		Person p = new Person();
		String input = "Dereck";
		String output = p.getInitial(input);
		String expected = "D";
		assertEquals(output, expected);
		for(int i = 0; i < 1000; i++){
			input += " Dereck";
			output = p.getInitial(input);
			expected += "D";
			System.out.println("Testing " + (i+1) + " space name.");
			assertEquals(output, expected);
		}
	}

}