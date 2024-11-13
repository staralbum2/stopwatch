package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract public class StopwatchThread extends Thread {
	
	protected static boolean isRun = true;
	protected static boolean stopwatchRun = true;
	protected BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	protected StringBuffer bf = new StringBuffer();
	protected BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	protected Calendar cal = Calendar.getInstance();
	protected SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
	protected static int time = 0;
	
}
