import java.util.List;
import java.util.LinkedList;

public class GameOfLife{

	/**
	* Gets the next state of current cell
	* if there are 2 or 3 neighbours
	*
	* @Param Current state of cell, either Dead or Live
	* @Param Neighbour count for current cell
	*/
	public static State getNextState(State current, int neighbourCount){
		if(neighbourCount == 2){
			return current;
		}
		if(neighbourCount == 3){
			return State.LIVE;
		}
		return State.DEAD;
	}
	/*
	 ******** MY EXTREME VERSION !! **** does exactly the same as above but with extra code!
		if(current == State.LIVE){
			if(neighbourCount > 1 && neighbourCount < 3){
				return State.LIVE;
			}
			if(neighbourCount > -1 && neighbourCount < 2 || neighbourCount > 3 && neighbourCount < 9){
			return State.DEAD;
			}
		}
		if(neighbourCount > -1 && neighbourCount < 3 || neighbourCount > 3 && neighbourCount < 9){
			return State.DEAD;
		}
		if (neighbourCount == 3) {
			return State.LIVE;
		}
		throw new IllegalArgumentException("Two many / Not enough neighbours!!!");
	} */
}