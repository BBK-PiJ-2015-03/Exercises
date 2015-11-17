import org.junit.*;
import static org.junit.Assert.*;

public class PrimeDivisorListTest{
	PrimeDivisorListImpl primeList;

	@Before
	public void buildUp(){
		primeList = new PrimeDivisorListImpl();
	}
	@Test
	public void testToString(){
		String str = "";
		assertEquals("Helo", primeList.toString());
	}
}