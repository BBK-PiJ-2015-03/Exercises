/**
* This is a smart phone without access to games
*/
public class RestrictedSmartPhone extends SmartPhone{

	
	public RestrictedSmartPhone(String brand){
	/*
	* Sets phone brand
	*/
	super(brand);
	}	


	/**
	* Method would not work;
	* error: attempting to assign weaker access privileges; was public 
	* @Override
	* private void playGame(String game){
	*	System.out.println("Restricted area.");
	* }
	*/
}