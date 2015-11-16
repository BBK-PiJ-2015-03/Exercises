
public class ErrorHandlingOnUserInput {

	public static void main(String[] args) {
		ErrorHandlingOnUserInput eh = new ErrorHandlingOnUserInput();
		eh.launch();
	}
	
	public void launch(){
		int mean = 0;
		int[] intArray = new int[10];
		System.out.println("Please enter 10 numbers");
		for(int i = 0; i < intArray.length;){
			try {
				System.out.print("> ");
				String str = System.console().readLine();
				intArray[i] = Integer.parseInt(str);
				i++;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR: Only numbers are valid");
			}
		}
		System.out.println("mean: " + workMean(intArray));
	}

	public int workMean(int[] iArray){
		int r = 0;
		for(int i = 0; i < iArray.length; i++){
			r += iArray[i];
		}
		return (r/10);
	}

}
