package stopwatch;

import java.io.IOException;

public class StopwatchRun extends StopwatchThread {

    private void printResalt() {
        minute = time / 60;
        second = time % 60;

        bf.setLength(0);
        bf.append(String.format("%d분 %d초 소요됨", minute, second));
        try {
            wr.write(bf.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                wr.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (isRun) {
            if (stopwatchRun) {
                try {
                    bf.setLength(0);

                    bf.append(sdf.format(cal.getTime()));
                    bf.append(" sec) " + time++);
                    bf.append("\n");
                    wr.write(bf.toString());
                    wr.flush();
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    isRun = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    isRun = false;
                }
            }
        }
        printResalt(); 
    }
}
