package example2;

public class Calculator implements Runnable {
	private int number;

	

	@Override
	public void run() {
		for(int i=1; i<=10; i++)
			System.out.printf("%s: %d * %d = %d \n", Thread.currentThread().getName(),
					number,i,i*number);

	}
	public Calculator(int number) {
		super();
		this.number = number;
	}

}
