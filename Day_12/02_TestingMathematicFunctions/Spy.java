/**
* I did not manage to do the 'simple' hash excersize
* so I will be testing this class
*/

public class Spy {
	private static int spyCount = 0;
	private int id;

	public int getId(){
		return this.id;
	}

	public int getSpyCount(){
		return this.spyCount;
	}


	public Spy(int id) {
		spyCount++;
		this.id = id;
		System.out.println("ID: #" + id);
		System.out.println("Total Spies: " + spyCount);
		System.out.println(" "); // Line break for clarity
	}

	public void die() {
		System.out.println("Spy " + id + " had been detected and eliminated");
		spyCount = spyCount-1;
		System.out.println("Total Spies: " + spyCount);
		System.out.println(" "); // Line break for clarity
	}

	public static int getNumberOfSpies() {
		return spyCount;

	}
}