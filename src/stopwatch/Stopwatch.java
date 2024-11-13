package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Stopwatch extends StopwatchRun {

    private Stopwatch() {}

    private static Stopwatch insStopwatch = new Stopwatch();

    private Input input = new Input();
    private StopwatchRun stopwatchRun = new StopwatchRun();
    private Thread in = new Thread(input);
    private Thread stop = new Thread(stopwatchRun);

    private StringBuffer msg = new StringBuffer();
    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    private SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
    private Calendar cal = Calendar.getInstance();

    public static Stopwatch getInstance() {
        return insStopwatch;
    }

    public void run() {
        printMenu();
        runStopwatch();
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
            } catch (Exception e2) {}
        }
    }

    private void runStopwatch() {
        stop.start();
        in.start();
    }

    private void printResalt() {
        minute = time / 60;
        second = time % 60;

        msg.setLength(0);
        msg.append(String.format("%d분 %d초 소요됨", minute, second));
        try {
            writer.write(msg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
