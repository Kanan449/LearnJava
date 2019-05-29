package day26_arrays04;

import java.util.Arrays;
import java.util.Random;

public class WarmUpNames {
	public static void main(String[] args) {

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// Print number of names in the array.
		System.out.println("Total number of names: " + names.length);
		System.out.println();
		// Print all names in single line
		System.out.println(Arrays.toString(names));

		// Print in column format
		System.out.println();
		for (int i = 0; i < names.length - 1; i++) {
			System.out.println(names[i] + ", " + names[i + 1]);
		}
		// Print male names in single line seperated by comma
		System.out.println("MALE NAMES");
		for (int m = 0; m < names.length; m += 2) {
			System.out.print(names[m] + ", ");
		}
		// Print all females names in single line separated by comma
		System.out.println("\nFEMALE NAMES:");

		for (int idx = 0; idx < names.length; idx++) {
			if (idx % 2 == 1) {
				if (idx == names.length - 1) {
					System.out.println(names[idx]);
				} else {
					System.out.print(names[idx] + ", ");
				}
			}
		}

		// Print random name from this array

		Random random = new Random();

		int r = random.nextInt(names.length);
		System.out.println("Random name: " + names[r]);

//Print all names that are up to four characters, in uppercase in one line

//	for(int k = 0 ; k<names.length; k++) {
//		if(names[k].length()<=4) {
//			System.out.print(names[k].toUpperCase()+" ");
//		}
//	}

		for (String name : names) {
			if (name.length() <= 4) {
				System.out.print(name.toUpperCase() + " \n");
			}
		}

		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		for (String nName : names) {
			if (nName.length() <= 4) {
				namesUpto4 += nName + " ";
			}
			if (nName.length() == 5 || nName.length() == 6) {
				names5to6 += nName + " ";
			}
			if (nName.length() >= 7) {
				names7orMore += nName + " ";

			}
		}
		System.out.println("NAMES UP TO FOUR CHARACTERS: " + namesUpto4);
		System.out.println("NAMES WITH FIVE OR SIX CHARACTERS: " + names5to6);
		System.out.println("NAMES WITH SEVEN OR MORE CHARACTERS: " + names7orMore);

		System.out.println();
        //SWAP SEATS
		
		System.out.println(Arrays.toString(names));

		// CODE HERE

		for (int i = 0; i< names.length; i+=2) {
			String temp = names[i];
			names[i]= names[i+1];
			names[i+1] = temp;
		}
		
		System.out.println(Arrays.toString(names));
		
	}
}
