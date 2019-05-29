package replHomeWorkProblems;
import java.util.*;
public class RepeatSeperator089 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String separator = scan.next();
    int count = scan.nextInt();
    String newWord = "";
    for (int i = 0; i < count ; i++) {
    	newWord+=word+separator;
    	
    }
   int lastSep = newWord.lastIndexOf(separator);
    	
    System.out.println(newWord.substring(0, lastSep));	
}
}
