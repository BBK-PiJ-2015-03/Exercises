public class main {
	public static void main(String[] args) {

		//Add four new spies
		Spy jimmy = new Spy(12);

		Spy bond = new Spy(97);

		Spy micky = new Spy(23);

		Spy donald = new Spy(101);

		//Killing three of the spies
		bond.die();

		micky.die();

		donald.die();
	}
}