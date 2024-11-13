package stopwatch;

import java.io.IOException;

public class StopwatchRun extends StopwatchThread{
	
	@Override
	public void run() {
		while (isRun) {
			if (stopwatchRun) {
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
