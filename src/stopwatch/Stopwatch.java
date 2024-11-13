package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Stopwatch extends StopwatchRun {
	private Stopwatch() {

	}


	private static Stopwatch insStopwatch = new Stopwatch();
	private Thread input = new Thread();
	private Thread stopwatchRun = new Thread();
	private int second;
	private int minute;
	private StringBuffer msg = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static Stopwatch getInstance() {
		return insStopwatch;
	}

	public void run() {
		printMenu();
		while (isRun) {
			runStopwatch();
		}
		printResalt();
	}

	private void printMenu() {
		msg.append("q) stop\nh) hold\n*) return");
		try {
			writer.append(msg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.flush();
			} catch (Exception e2) {

			}
		}

	}

	private void runStopwatch() {
		stopwatchRun.start();
		input.start();
		
	}

	private void printResalt() {
		minute = time/60;
		second = time%60;
		msg.append(String.format("%d분 %d초 소요됨",minute,second);
		try {		
			writer.append(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
			} catch (Exception e2) {
			}
		}
	}

}
