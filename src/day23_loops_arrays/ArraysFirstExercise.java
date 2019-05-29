package day23_loops_arrays;

public class ArraysFirstExercise {
	public static void main(String[] args) {

		String[] names = new String[5];
		String[] names2 = { "Shaun", "Roman", "Vlad", "Burak", "Maria" };

		System.out.println(names2[4]);

		System.out.println("Number of items: " + names2.length);

		String[] countries = { " " };

		countries[0] = "USA";

		String[] fruits = new String[] { "apple", "orange" };

		for (String fruit : fruits)
			System.out.println(fruit);

	}
}
