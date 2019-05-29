package replHomeWorkProblems;

import java.util.*;

public class TimeConversion150 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {

		// Write your code here.
		if (s.contains("PM")) {
			if (s.equals("12:00:00PM")) {
				System.out.println("12:00:00");
			} else {
				s = s.replace("PM", "");
				String[] time = s.split(":");
				int hour = Integer.parseInt(time[0]);
				hour = hour + 12;
				time[0] = "" + hour;
				System.out.println(Arrays.toString(time));
			}
		} else if (s.contains("AM")) {
			System.out.println(s);
		} else if (s.equals("12:00:00AM")) {
			System.out.println("00:00:00");
		}

	}
}
