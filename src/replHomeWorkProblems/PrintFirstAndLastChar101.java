package replHomeWorkProblems;

import java.util.Scanner;

public class PrintFirstAndLastChar101 {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    int wLength = 0;
	    for (int i = 0; i<words.length; i++) {
	      int wordL = words[i].length();
	      System.out.println(words[i].charAt(0)+""+words[i].charAt(wordL-1));
	    }
}
}