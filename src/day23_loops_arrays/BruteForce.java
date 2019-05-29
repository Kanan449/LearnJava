package day23_loops_arrays;

import java.util.Scanner;

public class BruteForce {
	public static void main(String[] args) {

		String expectedUserName = "admin";
		String expectedPassword = "admin123";

		String username = "";
		String password = "";

		int attempts = 5;
		Scanner scan = new Scanner(System.in);
		do {
			if (attempts == 0) {
				System.out.println("You have exceeded number of attempts");
				System.out.println("This user has been deactivated");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			username = scan.next();
			if (!username.equals(expectedUserName)) {
				System.out.println("Wrong username");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			if (!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
		} while (!username.equals(expectedUserName) || !password.equals(expectedPassword));

		System.out.println("Wellcome");

	}
}
