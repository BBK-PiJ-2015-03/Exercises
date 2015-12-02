import java.util.concurrent.*;

public class TextLoop implements Runnable{
	public static final int COUNT = 10;
	private final String name;
	
	public TextLoop(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
		System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}
	
	public static void main(String args[]) {
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(100);
		Executor e = new ThreadPoolExecutor(10, 20, 1, TimeUnit.SECONDS, workQueue);
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoop("Thread " + i);
				r.run();
			}
		} else {
			for (int i = 0; i < 100; i++) {
				e.execute(new TextLoop("Thread " + i));
			}
			((ThreadPoolExecutor)e).shutdown();
			System.out.println("I HAVE SHUTDOWN!");
		}
	}
}