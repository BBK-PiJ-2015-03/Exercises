public class Spy {
	private static int spyCount = 0;
	private int id;
	

	public Spy() {
		spyCount++;
	}

	public static int getNumberOfSpies() {
		return spyCount;

	}
}

