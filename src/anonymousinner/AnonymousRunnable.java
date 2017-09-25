package anonymousinner;

public class AnonymousRunnable {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(" Anonymous Runnable class");
			}
		});

		thread.start();
	}

}
