package exercise3;

public class Main {

	public static void main(String[] args) {
		Thread task = new PrimeGenerator();
		task.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();

	}

}
