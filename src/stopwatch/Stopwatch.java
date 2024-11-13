package stopwatch;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Stopwatch {
	private Stopwatch(){
		
	}
	private static Stopwatch insStopwatch = new Stopwatch();
	public static Stopwatch getInstance() {
		return insStopwatch;
	}
	
private static Scanner scanner = new Scanner(System.in);
	
	private static SimpleDateFormat sdf;
	private static boolean isRun = true;
	private static int minute;
	private static int second;
	
	public static void run() {
		while(isRun) {
			setStopwatch();
			printMenu();
			runStopwatch();
		}
	}
	
	
}
