package day27_arrays05;

import java.util.*;

public class CanvasCourses {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String url = scan.nextLine();
		// Split by "/" and store into array
		String[] urlArr = url.split("/");
		System.out.println();
		System.out.println(Arrays.toString(urlArr));

		// Get last number and convert it into int data type
		int courseId = Integer.parseInt(urlArr[urlArr.length - 1]);
		// Use switch to find course name
		
		switch (courseId) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid number for the course");
			break;
		}
	}
}
