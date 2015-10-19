public class Spy {
	private static int spyCount = 0;
	private int id;


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

