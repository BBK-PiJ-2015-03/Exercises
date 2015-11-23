import static org.junit.Assert.*;
import org.junit.*;

public class GameOfLifeTest{
GameOfLife obj;

	@Before
	public void buildUp(){
		obj = new GameOfLife();
	}

	/**
	* checks that if we have 0 or 1 neighbours and cell is live that return is Dead
	*/
	@Test
	public void testLiveNeighbourReturnDeadFor0or1(){
		for(int i = 0; i < 2; i++){
			State expected = State.DEAD;
			State actual = obj.getNextState(State.LIVE, i);
			assertEquals(expected, actual);
		}
	}

	/**
	* checks that if we have 0 or 1 neighbours and cell is dead that its return is Dead
	*/
	@Test
	public void testDeadNeighbourReturnDeadFor0or1(){
		for(int i = 0; i < 2; i++){
			State expected = State.DEAD;
			State actual = obj.getNextState(State.DEAD, i);
			assertEquals(expected, actual);
		}
	}

	/**
	* Checks that if we have between 4-8 neighbours and cell is 
	* currently Dead it will return Dead
	*/
	@Test
	public void testDeadCellReturnDeadFor4to8Neighbours(){
		for(int i = 4; i < 9; i++){
			State expected = State.DEAD;
			State actual = obj.getNextState(State.DEAD, i);
			assertEquals(expected, actual);
		}
	}

	/**
	* Checks that if we have between 4-8 neighbours and cell is 
	* currently Live it will return Dead
	*/
	@Test
	public void testLiveCellReturnDeadFor4to8Neighbours(){
		for(int i = 4; i < 9; i++){
			State expected = State.DEAD;
			State actual = obj.getNextState(State.LIVE, i);
			assertEquals(expected, actual);
		}
	}

	/**
	* Checks that if we have 2 neighbours and cell is
	* currently Live it will return Live
	*/
	@Test
	public void testLiveCellReturnLiveWith2Neighbours(){
		State expected = State.LIVE;
		State actual = obj.getNextState(State.LIVE, 2);
		assertEquals(expected, actual);
		
	}

	/**
	* Checks that if we have 2 neighbours and cell is 
	* currently Dead it will return Dead
	*/
	@Test
	public void testDeadCellReturnDeadWith2Neighbours(){
		State expected = State.DEAD;
		State actual = obj.getNextState(State.DEAD, 2);
		assertEquals(expected, actual);
	}

	/**
	* Checks that if we have 2 neighbours and cell is 
	* currently Dead it will return Dead
	*/
	@Test
	public void testDeadCellReturnLiveWith3Neighbours(){
		State expected = State.LIVE;
		State actual = obj.getNextState(State.DEAD, 2);
		assertEquals(expected, actual);
	}

	/**
	* Checks that if we have 2 neighbours and cell is 
	* currently Dead it will return Dead
	*/
	@Test
	public void testLiveCellReturnLiveWith3Neighbours(){
		State expected = State.LIVE;
		State actual = obj.getNextState(State.LIVE, 2);
		assertEquals(expected, actual);
	}

}