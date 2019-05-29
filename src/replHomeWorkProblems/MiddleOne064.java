package replHomeWorkProblems;

import java.util.Scanner;

public class MiddleOne064 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = scan.next();
		int wordLength = word.length();
		int oddNumber=wordLength%2;
		int middleLetter = wordLength/2;
		
	    if (oddNumber>0 && wordLength >=3) {
	    	System.out.println(word.charAt(middleLetter));
	    }else if (wordLength ==1 ) {
	    	System.out.println(word+""+word+""+word);
	    }else if(oddNumber==0 && wordLength>=4) {
		      System.out.println(word.substring(middleLetter-1,middleLetter+1));
	    }else if (wordLength==2) {
	    	System.out.println(word+word);
	    }
		
		
		
		
		
	}

}
