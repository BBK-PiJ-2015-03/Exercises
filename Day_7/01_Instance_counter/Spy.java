public class Spy {
	private static int spyCount = 0;
	private int id;


	public Spy(int id) {
		spyCount++;
		this.id = id;
		System.out.println("ID: #" + id);
		System.out.println("Total Spies: " + spyCount);
	}

	public static int getNumberOfSpies() {
		return spyCount;

	}
}

