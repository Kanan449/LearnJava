package day34_methods06;

import java.util.Arrays;
import java.util.Random;

public class CountArray {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 5, 6, 6, 6, 7, 5, 5, 12 };
		int fives = 5;
		int sixes = 6;
		System.out.println(findOccurences(nums, fives));
		System.out.println(findOccurences(nums, sixes));
		System.out.println(Arrays.toString(getRandomArray(10)));
		System.out.println(1001/1000);
		
		
		
		
	}

	public static int findOccurences(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			}
		}
		return count;
	}

	public static int[] getArray() {
		int[] retArray = { 46, 43, 11, 545, 1000 };

		return retArray;
	}

	public static int[] getRandomArray(int size) {
		Random r = new Random();
		int[] randArray = new int[size];
		for (int i = 0; i < size; i++) {
			randArray[i] = r.nextInt(101);

		}
		return randArray;
	}

}
