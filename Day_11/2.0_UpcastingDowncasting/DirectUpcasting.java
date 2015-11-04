/**
 * 2.2 Direct upcasting
 *
 * Chnage the script so that Smartphone is created with the line:
 * 		Mobilephone myPhone = new Smartphone();
 * Compile your code again. Are there any problems? Why do this problems happen? What are the possible
 * solutions?
 *
 * DirectUpcasting.java:44: error: playGame(String) has private access in MobilePhone
 *						myPhone.playGame(gameName);
 *						       ^
 * DirectUpcasting.java:52: error: cannot find symbol
 *						System.out.println(myPhone.findPosition());
 *						                          ^
 * symbol:   method findPosition()
 * location: variable myPhone of type MobilePhone
 * DirectUpcasting.java:56: error: cannot find symbol
 *				case 7: myPhone.restrictSmartPhone();
 *				               ^
 * symbol:   method restrictSmartPhone()
 * location: variable myPhone of type MobilePhone
 * 3 errors
 *
 * Possible Solution:
 *
 * Casting to correct class (SmartPhone) myPhone
 *
 * 
 *
 */

public class DirectUpcasting {
	public static void main(String[] args) {
		/**
		 * Launches myPhone with menu
		 */
		MobilePhone myPhone = new SmartPhone("TEST BRAND");
		System.out.println("myPhone loading...");
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1 - Dial a number");
		System.out.println("2 - Set an alarm");
		System.out.println("3 - Launch a game");
		System.out.println("4 - View 10 last dialed numbers");
		System.out.println("5 - Check current GPS location");
		System.out.println("6 - Check phone brand");
		System.out.println("7 - Restrict / unrestrict phone");
		System.out.println("0 - Turn off phone");
		boolean finished = false;
		while (!finished){
			System.out.print("");
			System.out.print("> ");
			int choice = Integer.parseInt(System.console().readLine());
			System.out.print("");
			switch (choice) {
				case 1: System.out.print("Enter number: ");
						String number = System.console().readLine();
						myPhone.call(number);
						break;
				case 2: System.out.print("Enter alarm Time (e.g. 16:25): ");
						String alarmTime = System.console().readLine();
						myPhone.ringAlarm(alarmTime);
						break;
				case 3: System.out.print("Enter name of game: ");
						String gameName = System.console().readLine();
						((SmartPhone)myPhone).playGame(gameName);
						break;
				case 4: System.out.println("Last 10 numbers dialed");
						System.out.println("----------------------");
						System.out.println();
						myPhone.printLastNumbers();
						break;
				case 5: System.out.println("Checking current GPS position...");
						System.out.println(((SmartPhone) myPhone).findPosition());
						break;
				case 6: System.out.println("Phone Brand: " + myPhone.getBrand());
						break;
				case 7: ((SmartPhone) myPhone).restrictSmartPhone();
						break;
				case 0: System.out.println("Turning off...");
						finished = true;
						break;
				default:System.out.println("Invalid Input");
						break;
			}
		}
	}	
}
	
	
