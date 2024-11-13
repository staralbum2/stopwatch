package stopwatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input extends StopwatchThread {
	
	@Override
	public void run() {
		StopwatchThread stop = StopwatchThread.getStop();
		while (stop.getIsRun()) {
			try {
				char check = stop.getRd().readLine().charAt(0);
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
