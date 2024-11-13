package stopwatch;

import java.io.IOException;

public class Input extends StopwatchThread {

    @Override
    public void run() {
        while (isRun) {
            try {
                char check = rd.readLine().charAt(0);

                if (check == 'h' || check == 'H') {
                    stopwatchRun = false;  
                }
                else if (check == 'q' || check == 'Q') {
                    isRun = false;  
                }
                else {
                    stopwatchRun = true; 
                }
            } catch (IOException e) {
                isRun = false;
                e.printStackTrace();
            }
        }
    }
}
