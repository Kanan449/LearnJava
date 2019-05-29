package replHomeWorkProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayZombieAttack122 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		
		// TODO. Write you code below this line.
		int count = 0;
		int total = 0;
        int temp = 0;
		System.out.println(Arrays.toString(inhabitants));

		do {
			System.out.print("Day " + count + " ");
			System.out.println(Arrays.toString(inhabitants));
			for (int k = 0; k < inhabitants.length; k++) {
				temp = inhabitants[k] / 2;
				inhabitants[k]=temp;
				total += temp;
				count++;
			}
		} while (total > 0);

		System.out.println("---- EXTINCT ----");
	}
}
