/**
 * Launches phone program
 */

public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch(){
		/**
		 * Launches iPhone with menu
		 */
		SmartPhone iPhone = new SmartPhone("Apple");
		System.out.println("iPhone loading...");
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
						iPhone.call(number);
						break;
				case 2: System.out.print("Enter alarm Time (e.g. 16:25): ");
						String alarmTime = System.console().readLine();
						iPhone.ringAlarm(alarmTime);
						break;
				case 3: System.out.print("Enter name of game: ");
						String gameName = System.console().readLine();
						iPhone.playGame(gameName);
						break;
				case 4: System.out.println("Last 10 numbers dialed");
						System.out.println("----------------------");
						System.out.println();
						iPhone.printLastNumbers();
						break;
				case 5: System.out.println("Checking current GPS position...");
						System.out.println(iPhone.findPosition());
						break;
				case 6: System.out.println("Phone Brand: " + iPhone.getBrand());
						break;
				case 7: iPhone.restrictSmartPhone();
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
	
	
