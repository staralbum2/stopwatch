package stopwatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Input extends StopwatchThread {
	private BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public void run() {
		StopwatchThread stop = new StopwatchThread();
		while (stop.getIsRun()) {
			try {
				char check = rd.readLine().charAt(0);
				rd.close();
				if (check == 'h' || check == 'H')
					stop.stopwatchRun(1);
				else if (check == 'q' || check == 'Q')
					stop.isRun();
				else
					stop.stopwatchRun(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
