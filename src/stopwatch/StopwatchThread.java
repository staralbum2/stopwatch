package stopwatch;

import java.util.Calendar;

public class StopwatchThread extends Thread {
	

	private static boolean isRun = true;
	private static boolean stopwatchRun = true;

	public boolean getIsRun() {
		return isRun;
	}

	public void isRun() {
		isRun = false;
	}

	public boolean getStaopwatchRun() {
		return stopwatchRun;
	}

	public void stopwatchRun(int idx) {
		stopwatchRun = idx == 1 ? false : true;
	}
}
