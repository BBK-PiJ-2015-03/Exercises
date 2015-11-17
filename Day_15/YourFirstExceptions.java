public class YourFirstExceptions{
	public static void main(String[] args) throws CheckedException, NewRuntimeException{
		YourFirstExceptions launcher = new YourFirstExceptions();
		launcher.launch();		
	}

	public void launch() throws CheckedException, NewRuntimeException{
		header();
		menu();
		System.out.println("");
		System.out.println("Please select an option");
		System.out.print("> ");
		int choice = intInput();

		switch(choice){
			case 1:	try{
						throw new CheckedException("I am a checked exception and I have been thrown inside of a try block");
					} catch(CheckedException ex) {
						ex.getMessage();
						ex.printStackTrace();
						break;
					}
			case 2:	try{
						throw new NewRuntimeException("I am a runtime exception and I have been thrown inside of a try block");
					} catch(NewRuntimeException ex) {
						ex.getMessage();
						ex.printStackTrace();
						break;
					}
			case 3: throw new CheckedException("I am a checked exception and I have been thrown outside of a try block");
			case 4:	throw new NewRuntimeException("I am a runtime exception and I have been thrown outside of a try block");
			default: break;
		}
	}

	public void header(){
		System.out.println("▄▄▄ .▐▄• ▄  ▄▄· ▄▄▄ . ▄▄▄·▄▄▄▄▄▪         ▐ ▄ .▄▄ · ");
		System.out.println("▀▄.▀· █▌█▌▪▐█ ▌▪▀▄.▀·▐█ ▄█•██  ██ ▪     •█▌▐█▐█ ▀. ");
		System.out.println("▐▀▀▪▄ ·██· ██ ▄▄▐▀▀▪▄ ██▀· ▐█.▪▐█· ▄█▀▄ ▐█▐▐▌▄▀▀▀█▄");
		System.out.println("▐█▄▄▌▪▐█·█▌▐███▌▐█▄▄▌▐█▪·• ▐█▌·▐█▌▐█▌.▐▌██▐█▌▐█▄▪▐█");
		System.out.println(" ▀▀▀ •▀▀ ▀▀·▀▀▀  ▀▀▀ .▀    ▀▀▀ ▀▀▀ ▀█▄▀▪▀▀ █▪ ▀▀▀▀ ");
		System.out.println("                   				v1.0");
	}

	public void menu(){
		System.out.println("OPTION MENU");
		System.out.println("1 - Throw checked exception inside a try block");
		System.out.println("2 - Throw runtime exception inside a try block");
		System.out.println("3 - Throw checked excepion outside a try block");
		System.out.println("4 - Throw runtime excepion outside a try block");
	}

	public int intInput(){
		int n = 0;
		while(true){
			try {
				n = Integer.parseInt(System.console().readLine());
				return n;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR: Only numbers are valid");
				System.out.print("> ");
			}
		}
	}

}