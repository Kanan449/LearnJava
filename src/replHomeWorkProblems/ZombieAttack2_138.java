package replHomeWorkProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2_138 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int sum = 1;
		int count = 0;
		System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
		while (sum > 0) {

			sum = 0;

			for (int i = 1; i < inhabitants.length; i++) {
				if (inhabitants[i] == 0) {
					if (inhabitants[i + 2] == 0) {
						inhabitants[i - 1] = inhabitants[i - 1] / 4;
					} else {
						inhabitants[i - 1] = inhabitants[i - 1] / 2;
					}
				}
			}
			for (int k = 6; k > 1; k--) {
				if (inhabitants[k] == 0) {
					if (inhabitants[k - 2] == 0) {
						inhabitants[k + 1] = inhabitants[k + 1] / 4;
					} else {
						inhabitants[k + 1] = inhabitants[k + 1] / 2;
					}

				}
			}

//				if (i == 0 && inhabitants[i] == 0) {
//					inhabitants[i + 1] = inhabitants[i + 1] / 2;
//				} else if (i == 7 && inhabitants[i] == 0) {
//					inhabitants[i - 1] = inhabitants[i - 1] / 2;
//				} else if (inhabitants[i] == 0) {
//					inhabitants[i - 1] = inhabitants[i - 1] / 2;
//					inhabitants[i + 1] = inhabitants[i + 1] / 2;
//				}

			for (int k = 0; k < inhabitants.length; k++) {
				sum += inhabitants[k];

			}

			count++;
			System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

		}
		System.out.println("---- EXTINCT ----");
	}
}