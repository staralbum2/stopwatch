package stopwatch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StopwatchRun extends StopwatchThread {
	
	private StringBuffer bf = new StringBuffer();
	private BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	private Calendar cal = Calendar.getInstance();
	private SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
	public static int time = 0;
	private  StopwatchThread stop = new  StopwatchThread();
	
	@Override
	public void run() {
		while (stop.getIsRun()) {
			if (stop.getStaopwatchRun()) {
				try {
					bf.setLength(0);
					bf.append(sdf.format(cal.getTime()));
					bf.append("sec) " + time++);
					wr.append(bf);
					wr.flush();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						wr.close();
					} catch (Exception e2) {

					}
				}
			}
		}
	}
	
}
