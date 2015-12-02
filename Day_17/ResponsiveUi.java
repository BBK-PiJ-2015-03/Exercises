import java.util.Scanner;

public class ResponsiveUi implements Runnable{
	private int tasknum = 0;

	public static void main(String[] args) {
		ResponsiveUi ln = new ResponsiveUi();
		ln.launch();		
	}

	public void launch(){
		for (int i = 0; i < 10; i++) {
			tasknum = i;
			Runnable j = new ResponsiveUi();
			Thread t = new Thread(j);
			t.start();
		}
	}

	public void run(){
		System.out.print("Enter the duration in (in ms) of task "+tasknum+":");
		try{
			synchronized (this){
				String str = System.console().readLine();
				int ms = Integer.parseInt(str);
				Thread.sleep(ms);
				System.out.print("Finished tasks: " + tasknum);
			}
		}catch(InterruptedException ex){
			//ignoring this thread interruption
		}
	}

}