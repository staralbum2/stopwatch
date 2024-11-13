package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	StopwatchThread stop = new StopwatchThread();
	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
	private Calendar cal = Calendar.getInstance();
	public static Stopwatch getInstance() {
		return insStopwatch;
	}

	public void run() {
		printMenu();
		runStopwatch();
//		while (stop.getIsRun()) {
//			if (stop.getStaopwatchRun()) {
//				try {
//					msg.setLength(0);
//					msg.append(sdf.format(cal.getTime()));
//					msg.append("sec) " + time++ + "\n");
//					writer.append(msg);
//					writer.flush();
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} finally {
//					try {
//						writer.close();
//					} catch (Exception e2) {
//
//					}
//				}
//			}
//		}
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
		minute = time/60;
		second = time%60;
		
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
