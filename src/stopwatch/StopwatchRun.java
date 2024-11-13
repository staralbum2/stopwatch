package stopwatch;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StopwatchRun extends StopwatchThread {
	private void setBuffered() {
		
	}
	@Override
	public void run() {
		StopwatchThread stop = StopwatchThread.getStop();
		while (stop.getIsRun()) {
			if (stop.getStaopwatchRun()) {
				try {
					bf.setLength(0);
					Calendar cal = stop.getCal();
					bf.append(sdf.format(cal.getTime()));
					bf.append("sec) " + stop.getTime());
					stop.setTime(stop.getTime()+1);
					wr.append(bf.toString());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						this.wr.close();
					} catch (Exception e2) {

					}
				}
			}
		}
	}
}
