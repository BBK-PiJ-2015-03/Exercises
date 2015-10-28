/**
* This class is attempting to extend the String class
*/
public class FinalMeansNoChange extends String {
	/**
	* Compiling error;
	* FinalMeansNoChange.java:4: error: cannot inherit from final String
    * public class FinalMeansNoChange extends String {
    *                                   ^
	*/
	public String printEven(){
		/**
		* This will @return even-numbered characters of the string
		*/
		return "even-numbered characters";
	}
}