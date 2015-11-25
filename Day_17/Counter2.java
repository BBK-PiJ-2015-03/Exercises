public class Counter2 {
	private int n = 0;
	public void increase() {
		synchronized(this){
			n++;
		}
	}
	public synchronized int getCount() {
		return n;
	}
}
