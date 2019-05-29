package replHomeWorkProblems;
import java.util.*;
public class ArraysReverse2Sentence103 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String reversed = "";
    //TODO: start your code here
    String rev[] = reversed.split(" ");
    for (int i = rev.length-1; i>0; i--) {
      reversed+=rev[i];
    }
    reversed = reversed.substring(0,reversed.length()-1);
    
    //End your code here. do not modify below statement
    System.out.println(reversed);
    
  

}
}
