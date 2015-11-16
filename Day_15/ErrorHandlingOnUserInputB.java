
public class ErrorHandlingOnUserInputB {

	public static void main(String[] args) {
		ErrorHandlingOnUserInputB eh = new ErrorHandlingOnUserInputB();
		System.out.println("|-----------------|");
		System.out.println("|-Mean Calculator-|");
		System.out.println("|------ v2.0 -----|");
		eh.launch();
	}
	
	public void launch(){
		int[] intArray;
		System.out.println("How many numbers to check?: ");
		int size = numberInput();
		intArray = new int[size];
		System.out.println("Please enter " + intArray.length + " numbers");
		for(int i = 0; i < intArray.length; i++){
			intArray[i] = numberInput();
		}
		System.out.println("mean: " + workMean(intArray));
	}

	public int numberInput(){
		int n = 0;
		while(true){
			try {
				System.out.print("> ");
				n = Integer.parseInt(System.console().readLine());
				return n;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR: Only numbers are valid");
			}
		}
	}

	public int workMean(int[] iArray){
		int r = 0;
		for(int i = 0; i < iArray.length; i++){
			r += iArray[i];
		}
		return (r/iArray.length);
	}

}
