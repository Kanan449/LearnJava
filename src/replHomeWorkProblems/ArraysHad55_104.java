package replHomeWorkProblems;
import java.util.*;
public class ArraysHad55_104 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		boolean check = false;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				check = true;
			}
		}

		System.out.println(check);

	}
}