package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Stopwatch {
	private Stopwatch() {

	}

	private static Stopwatch insStopwatch = new Stopwatch();

	public static Stopwatch getInstance() {
		return insStopwatch;
	}

	private static Scanner scanner = new Scanner(System.in);

	private static SimpleDateFormat sdf;
	private static boolean isRun = true;
	private static int minute;

	private StringBuffer bf = new StringBuffer();
	private BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void run() {
		setStopwatch();
		printMenu();
		while (isRun) {
			runStopwatch();
		}
	}

	private void setStopwatch() {

	}

	private void printMenu() {

	}

	private void runStopwatch() {
		// s h 를 제외한 아무키를 누르면 재시작
		boolean run = true;
		
	}

	private int inputNum(String msg) {
		try {
			wr.
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
