// Lecturer.java
/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {
	/**
	* I believe this class needs a constructor method
	*/
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
}