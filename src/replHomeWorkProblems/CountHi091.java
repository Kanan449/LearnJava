package replHomeWorkProblems;
import java.util.*;
public class CountHi091 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    int wordLength = str.length();
	    int count = 0;
	   
	    for (int  i = 0; i < wordLength-1; i++) {
	      if (str.substring(i,i+2).equalsIgnoreCase("hi")) {
	        count++;
	      }
	    }
	    System.out.println(count);
	  }
	}

