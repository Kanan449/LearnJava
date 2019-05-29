package replHomeWorkProblems;
import java.util.*;
public class MiddleThree065 {


  public static void main(String[] args) {
   
	Scanner scan = new Scanner(System.in);
	
	
    String word = scan.next();
    //YOUR CODE HERE
    
    int wordLength = word.length();
    //String threeLetters = word.substring(wordLength/2,wordLength/2+2);
    int firstLetter = wordLength/2-1;
    //String secondLetter = word.substring(wordLength/2+1);
    int thirdLetter = firstLetter+3;
    if (wordLength/2>0 && wordLength >=5) {
      System.out.println(word.substring(firstLetter,thirdLetter));
    }
    
  }
  
}