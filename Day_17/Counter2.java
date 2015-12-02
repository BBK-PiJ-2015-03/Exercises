public class Counter2 {
	private int n = 0;
	public void increase() {
		n += 1;
	}
	public synchronized int getCount() {
		return n;
	}
}
