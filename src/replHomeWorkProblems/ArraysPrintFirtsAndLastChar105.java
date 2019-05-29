package replHomeWorkProblems;
import java.util.*;
public class ArraysPrintFirtsAndLastChar105 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		String print = "";
		for (int i = 0; i < words.length; i++) {
			print += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + ", ";
			
		}
		print = print.substring(0, print.lastIndexOf(","));
		System.out.println("["+print+"]");
	}
}
