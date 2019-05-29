package replHomeWorkProblems;

import java.util.Scanner;

public class PrintUniqueNumbers152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		int count = 0;
		int k = 0;
		String newNums = "";
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (k = 0; k < nums.length; k++) {
				if (nums[i] == nums[k]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}

		}
	}
}
