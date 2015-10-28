/**
* Testing of the Teacher and Lecturer class
*/
public class Test{
	
	public static void main(String[] args) {
		/**
		* Launching test program
		*/
		Test launcher = new Test();
		launcher.launch();
	}
	
	public void launch() {
		/**
		* Testing constructor and both methods
		*/
		Lecturer computerScience = new Lecturer("Jimmy");
		System.out.print(computerScience.getName() + " is ");
		computerScience.doResearch("Algorithms");
		System.out.print(computerScience.getName() + " is ");
		computerScience.teach("Mathmatical Algorithms");

	}
}

/**
* Result of running Test.java
*
* Jimmy is doing research on: Algorithms
* Jimmy is teaching lesson: Mathmatical Algorithms
*/