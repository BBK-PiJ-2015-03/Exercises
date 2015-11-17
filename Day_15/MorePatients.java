import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class MorePatients{
	private String name;
	private int yearOfBirth;

	/**
	* Patient constructor, takes name and date of birth
	* of the new patient.
	*
	* @Param name of the new patient
	* @Param date of birth of patient in 8 digit format e.g. 19021992
	*/
	public MorePatients(String name, int yearOfBirth){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	/**
	* Works out age of patient by minusing year of birth from current year
	*
	* @Param year of birth from user input
	*
	* @throws if age is greater than 130 or less than 0 IllegalArgumentException is thrown
	* @Return year of birth only if it has not thrown an exception
	*/
	public int checkAge(int yearOfBirth) throws IllegalArgumentException{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - yearOfBirth;
		if(age > 130 || age < 0){
			throw new IllegalArgumentException();
		}
		return yearOfBirth;
	}

	/**
	* Empty constructor for accessor to methods in main class
	*/
	public MorePatients(){
	}

	/**
	* Prints name and age of patient
	*
	* @Param patient to print details of
	*/
	public String toString(){
		return "Name: " + this.name + "\nYear of birth: " + this.yearOfBirth;
	}

	/**
	* Gets user year of birth from input and returns it as a int
	* If user enters a non integer it will catch the error and ask for 
	* the user to re-enter the input 
	*
	* @Returns year of birth from user input
	*/
	public int yearInput(){
		int n = 0;
		while(true){
			try {
				n = Integer.parseInt(System.console().readLine());
				return n;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR: Only numbers are valid");
				System.out.print("Year of birth: ");
			}
		}
	}

	/**
	* Gets user name from input and returns it as a string
	*
	* @Return name from user input
	*/
	public String nameInput(){
		String str = System.console().readLine();
		return str;
	}

	/**
	* Fancy header for the program
	* this method is called before any other
	*/
	public void header(){
		System.out.println("*------------------*");
		System.out.println("| Patient List v1.0|");
		System.out.println("*------------------*");
	}

	/**
	* Contains all the code for the program to run,
	* Creates new patient from user input, uses various other methods 
	* to take input and validate it.
	*/
	public void launch(){
		header();
		List<MorePatients> patientList = new ArrayList<MorePatients>();
		System.out.print("Name: ");
		String name = nameInput();
		System.out.print("Year of birth: ");
		int yearOfBirth = checkAge(yearInput());
		MorePatients patientA = new MorePatients(name, yearOfBirth);
		System.out.println("New Patient Entered:");
		System.out.println(patientA);
	}
	
	/**
	* Main method
	*/

	public static void main(String[] args) {
		MorePatients mp = new MorePatients();
		mp.launch();
	}


}