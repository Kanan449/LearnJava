package replHomeWorkProblems;

import java.util.Scanner;

public class ReverseIt067 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    int wordLength = word.length();
		    
		    
		   
		    if(wordLength>5) {
		    	System.out.println("Too long");
		    }else if(wordLength<5) {
		    	System.out.println("Too short");
		    }else { 
		    	char indexFour = word.charAt(4);
			    char indexThree =word.charAt(3);
			    char indexTwo = word.charAt(2);
			    char indexOne = word.charAt(1);
			    char indexZero =word.charAt(0);
		    	System.out.println(indexFour+""+indexThree+""+indexTwo+""+indexOne+""+indexZero);
		    }
		    
	
	  
	  
	  
	  
	  
	  
	  
	  
	  }
		}