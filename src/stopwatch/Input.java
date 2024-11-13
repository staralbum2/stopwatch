package stopwatch;

import java.io.IOException;

public class Input extends StopwatchThread{
	@Override
	public void run() {
		try {
			String input = rd.readLine();
			char check = input.charAt(0);
			if(check == 'h' || check == 'H') 
				stopwatchRun = false;
			else if(check == 'q'|| check == 'Q')
				isRun = false;
			else
				stopwatchRun = true;
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				rd.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
