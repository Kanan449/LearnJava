package replHomeWorkProblems;
import java.util.*;
public class CountJava090 {
public static void main(String... boo) {
	
	Scanner scan = new Scanner(System.in);
	
	String word = scan.next();
	int wordLength = word.length();
	String wordOne = "";
	int count = 0;
	for (int i = 0 ; i< wordLength-3; i++) {
		if (word.substring(i,i+4).equalsIgnoreCase("java")) {
			count++;
		}
	}
	System.out.println(count);

	
	
	
}
}
