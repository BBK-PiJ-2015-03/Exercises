/**
 * 2.1 Start
 *
 * Create a script that builds a new Smartphone with the line:
 * 		Smartphone myPhone = new Smartphone();
 * and then uses all it methods.
 */

public class Start {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch(){
		/**
		 * Launches myPhone with menu
		 */
		SmartPhone myPhone = new SmartPhone("myPhone");
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
						myPhone.playGame(gameName);
						break;
				case 4: System.out.println("Last 10 numbers dialed");
						System.out.println("----------------------");
						System.out.println();
						myPhone.printLastNumbers();
						break;
				case 5: System.out.println("Checking current GPS position...");
						System.out.println(myPhone.findPosition());
						break;
				case 6: System.out.println("Phone Brand: " + myPhone.getBrand());
						break;
				case 7: myPhone.restrictSmartPhone();
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
	
	
