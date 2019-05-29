package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {

		String[][] teams = new String[2][6];

		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";

		// print how many rows /teams / arrays
		System.out.println("Number of rows: " + teams.length);
		// print how many people in the first team
		System.out.println("Number of people in the first team: " + teams[0].length);
		// print number of people in the second team
		System.out.println("Number of people in the second team: " + teams[1].length);
		// print everyone in one line
		System.out.println(Arrays.deepToString(teams));
		System.out.println();

		int[][] nums = new int[3][4];
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 77242;

		nums[1][0] = 256;
		nums[1][1] = 64546;
		nums[1][2] = 257776;
		nums[1][3] = 999776;

		nums[2][0] = 1256;
		nums[2][1] = 164546;
		nums[2][2] = 1257776;
		nums[2][3] = 1999776;

		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
		System.out.println();

		int[][] scores = { { 3, 5, 10 }, { 6, 4, 2, 10 } };
		System.out.println("Days played/Number of arrays: " + scores.length);
		System.out.println("Number of values in 1st: " + scores[0].length);
		System.out.println("Number if values in 2nd: " + scores[1].length);

		int[][] values = new int[4][];
		values[0] = new int[] { 34, 23, 5 };
		values[1] = new int[] { 34, 56, 6, 5, 34, 2, 2, 43, 45, 56, 567, 3 };

		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;

		values[3] = new int[] { 5, 12, 45, 77, 34 };

	}
}
