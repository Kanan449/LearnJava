package day39_array_list04;

import java.util.*;

public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(10);
		nums1.add(7);
		nums1.add(8);
		nums1.add(8);
		nums1.add(3);
		nums1.add(4);
		nums1.add(8);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.11);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);

		printList(nums1);

		double sum = sumList(doubleList);
		System.out.println(sum);

		System.out.println(getList(10));
		System.out.println();
		// for(;;) {
		System.out.println(randomNums(25));
		// }

		List<Integer> rList = new ArrayList(randomNums(10));
		Collections.sort(rList);
		System.out.println(rList.toString());

		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");

		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted.toString());

	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> dList) {
		double sum = 0;
		for (double g : dList) {
			sum += g;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int w = 1; w <= size; w++) {
			newList.add(w);
		}
		return newList;
	}

	public static List<Integer> randomNums(int size) {
		Random r = new Random();
		List<Integer> ranList = new ArrayList<>();
		for (int k = 0; k < size; k++) {
			ranList.add(r.nextInt(101));
		}
		return ranList;
	}

	public static List<Integer> convertToIntList(List<String> listArray) {
		List<Integer> newNums = new ArrayList<>();
		for (String k : listArray) {
			newNums.add(Integer.parseInt(k));
		}
		return newNums;
	}

}
