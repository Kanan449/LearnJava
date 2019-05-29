package replHomeWorkProblems;

import java.util.Scanner;

public class PrintTriangle99 {
public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (j = 0; j <= n; j++) {
			for (i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
