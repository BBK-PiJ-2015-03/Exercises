/**
 * A smart phone has all the options of a mobile phone
 * with the addition of browsing the web, and locating current position.
 */
public class SmartPhone extends MobilePhone {
	boolean restricted = false;
	
	public SmartPhone(String brand){
		/*
		* Sets phone brand
		*/
		super(brand);
	}	

	public void restrictSmartPhone(){
		System.out.println("Do you want to restrict phone? (YES / NO)");
		String str = System.console().readLine();
		if (str.equals("YES") || str.equals("yes")){
			this.restricted = true;
			System.out.println("This phone has been restricted");
		} else if (str.equals("NO") || str.equals("no")) {
			this.restricted = false;
			System.out.println("This phone has been unrestricted");
		} else {
			System.out.println("Invalid input ! , returning to menu...");
		}
	}

	public void playGame(String game){
		if (this.restricted){
			System.out.println("This phone is restricted.");
		} else {
			System.out.println("Launching " + game + "...");
		}
	}
	

	public void browseWeb(String url){
		/**
		 * Launches browser at the chosen <url>
		 */
	}

	@Override
	public void call(String number){
		/**
		*Checks if first two numbers are 00, if yes dial through internet
		*/
		if (number.charAt(0) == '0' && number.charAt(1) == '0'){
			System.out.println("Calling " + number + " through the internet to save money");
			storeLastDialed(number);
		} else {
			super.call(number);
		}
	}

	public String findPosition(){
		/**
		 * Returns current GPS location
		 */
		double currentLat = 51.52183;
		double currentLong = -0.130314;
		
		String currentLocation = "Latitude: " + currentLat + " | Longitude: " + currentLong;
		return currentLocation;		
	}
}
