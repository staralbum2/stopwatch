package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

public class StopwatchThread extends Thread{
	public boolean isRun = true;
	public int time = 0;
	public boolean stopwatchRun = true;
	public SimpleDateFormat sdf;
	public StringBuffer bf = new StringBuffer();
	public BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	public BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	
}
