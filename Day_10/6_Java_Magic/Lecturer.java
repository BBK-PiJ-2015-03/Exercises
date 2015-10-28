// Lecturer.java
/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {
	/**
	* I have added a constructor method as required
	*/
	public Lecturer(String name){
		super(name);
	}

	public void doResearch(String topic) {
		System.out.println("doing research on: " + topic);
	}
}