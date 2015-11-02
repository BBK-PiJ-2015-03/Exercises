import org.junit.*;
import static org.junit.Assert.*;

public class TestSpy{

	@Test
	public void testCreateSpy(){
		int input = 12;
		Spy test = new Spy(input);
		String output = "" + test.getId();
		String expected = "12";
		assertEquals(output, expected);

	}

	@Test
	public void testCreateSpyLimit(){
		Spy newSpyJ = new Spy(13);
		Spy newSpyS = new Spy(21);
		Spy newSpyT = new Spy(142);
		Spy newSpyH = new Spy(431);
		String output = "" + newSpyS.getSpyCount();
		String expected = "4";
		assertEquals(output, expected);

	}
}