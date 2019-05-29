package day23_loops_arrays;

public class Print5rowsLetters {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (char let = 'a'; let <= 'z'; let++) {
				System.out.print(let + " ");
			}
			System.out.println();
			System.out.println("**********************");
		}

	}
}
