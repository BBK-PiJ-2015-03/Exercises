/**
 * A mobile phone makes calls, rings alarm,
 * launches games and stores the last 10 numbers called.
 */
public class MobilePhone extends OldPhone{
	private String[] numberDialed = new String[10];
	private int numberDialedCount;
	private int totalNumberStored;
	boolean flag = true;

	public MobilePhone(String brand){
		/*
		* Sets phone brand
		*/
		super(brand);
	}

	public void ringAlarm(String alarm){
		/**
		 * Rings alarm
		 */
		System.out.println("Alarm has been set for " + alarm);
	}
	
	private void playGame(String game){
		/**
		 * Launches game
		 */
		System.out.println("Launching " + game + "...");
	}
	
	@Override
	public void call(String number){
		super.call(number);
		storeLastDialed(number);
	}
	
	/**
	* This method is no longer needed as I have overrided call above
	*
	* public void callNumber(String number){
	*	call(number);
	*	storeLastDialed(number);
	* } 
	**/
	
	public void storeLastDialed(String number){
		/**
		 * Stores last 10 number called
		 */
		if (numberDialedCount < 10){
				numberDialedCount++;
				numberDialed[numberDialedCount-1] = number;
				if (totalNumberStored < 10 && flag == true){
					totalNumberStored = numberDialedCount;
				}
		} else {
			numberDialedCount = 0;
			numberDialed[numberDialedCount] = number;
			flag = false;

		}		
	}
	
	
	public void printLastNumbers(){
		/**
		 * Prints last 10 numbers that have been called
		 */
		for (int i = 0; i <= totalNumberStored; i++){
			System.out.println((i+1) + ": " + numberDialed[i]);
		}
	}
}
