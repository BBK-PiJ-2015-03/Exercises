public class ResponsiveUi {
	public static void main(String[] args) {
		
	}

	public void launch(){
		for (int j = 0; i < 10; i++) {
			Runnable j = new ResponsiveUI();
			Thread t = new Thread(j);
			System.out.print("Enter the duration in (in ms) if task "+i+":");
			t.start();
			System.out.print("Finished tasks: " + i);
		}
	}

	public void run(){
		int ms = Integer.parseInt(System.console().readline());
		sleep(ms);
	}

	public void sleep(int ms){
		Thread.sleep(ms);
	}

}