package exercise6;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {

	@Override
	public void run() {
		System.out.printf("Beginning data sources2 loading: %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(9);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Data sources2 loading has finished: %s\n", new Date());
	}
}
