package stopwatch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
	
	private StringBuffer bf = new StringBuffer();
	private BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out))
	
			public void run() {
		
		while(isRun) {
			setStopwatch();
			printMenu();
			runStopwatch();
		}
	}
	
	private void setStopwatch() {
	
	}
	private void printMenu() {
		
	}
	private void runStopwatch() {
		
	}
	
	private int inputNum(String msg) {
		
		bf.append(msg + " : ");
		
		
	}
	
}
