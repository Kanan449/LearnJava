package replHomeWorkProblems;

import java.util.*;

public class CheckIfPalindrome_154 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		// WRITE YOUR CODE HERE
		int div = 1;
		int count = 0;
		int k = num;
		while (k > 0){
			k = num / div;
			div = div * 10;
			count++;
		}

		
		int [] newNum = new int [count];
		int temp = num;
		for (int i = 0; i < count; i++) {
			int n1 = temp % 10;
			temp = temp / 10;
			--count;
			newNum[count]=n1;
			}

		
		
		
		//int result = Integer.parseInt(newNum);
		//System.out.println(result == num ? "true" : "false");

	}
}