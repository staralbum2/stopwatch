package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

public class Stopwatch extends StopwatchRun {
	private Stopwatch() {

	}
	private static Stopwatch insStopwatch = new Stopwatch();
	private Thread input; 
	private Thread stopwatchRun;
	
	private int second;
	private int minute;
	private StringBuffer msg = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Stopwatch getInstance() {
		return insStopwatch;
	}

	public void run() {
		printMenu();
		runStopwatch();
		printResalt();
	}

	private void printMenu() {
		msg.append("q) stop\nh) hold\n*) return\n");
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
		input = new Thread();
		stopwatchRun = new Thread();
		stopwatchRun.start();
		input.start();
	}

	private void printResalt() {
		minute = stop.getTime()/60;
		second = stop.getTime()%60;
		msg.setLength(0);
		msg.append(String.format("%d분 %d초 소요됨",minute,second));
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
