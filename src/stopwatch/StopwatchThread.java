package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StopwatchThread extends Thread {

	private static Calendar cal = Calendar.getInstance();
	private static boolean isRun = true;
	private static int time = 0;
	private static boolean stopwatchRun = true;
	public static SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
	public static StringBuffer bf = new StringBuffer();
	public static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StopwatchThread stop = new StopwatchThread();
	
	public static Calendar getCal() {
		return cal;
	}
	public static StopwatchThread getStop() {
		return stop;
	}

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

	public int getTime() {
		return time;
	}
	public void setTime(int input) {
		time = input;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public StringBuffer getBf() {
		return bf;
	}

	public BufferedReader getRd() {
		return rd;
	}

	public BufferedWriter getWr() {
		return wr;
	}

}
