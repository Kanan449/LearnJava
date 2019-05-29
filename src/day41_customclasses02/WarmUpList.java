package day41_customclasses02;

import java.util.*;

public class WarmUpList {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));

		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);
	}

	public static List<Integer> doubleTheList(List<Integer> myList2) {
		for (int i = 0; i < myList2.size(); i++) {
			myList2.set(i, myList2.get(i * 2));
		}
		return myList2;
	}
}
