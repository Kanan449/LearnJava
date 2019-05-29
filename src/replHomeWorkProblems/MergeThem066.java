package replHomeWorkProblems;

import java.util.Scanner;

public class MergeThem066 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    
	    int word1Length=word1.length();
	    int word2Length=word2.length();
	    
	    char w10= word1.charAt(0);
	    char w11= word1.charAt(1);
	    char w12= word1.charAt(2);
	    
	    char w20= word2.charAt(0);
	    char w21= word2.charAt(1);
	    char w22= word2.charAt(2);
	    
	    if (word2Length==3 && word1Length==3) {
	         System.out.println(w10+""+w20+""+w11+""+w21+""+w12+""+w22);
	         System.out.println(""+w10+w20+w11+w21+w12+w22);
	      }else {
	        System.out.println("can not merge");
	    }

}
}