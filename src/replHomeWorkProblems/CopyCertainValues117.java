package replHomeWorkProblems;

import java.util.Arrays;

public class CopyCertainValues117 {

		  public static void main(String[] args) {
		   // System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  public static String[] getWithE(String[] arr) {
		    
		  //TODO : YOUR CODE GOES HERE ----------------------
			  
		  String[] numbers = {"zero", "one", "two","three","four"};  
		  String fewV = "";
		  for(int i = 0; i < numbers.length; i++) {
		    if(numbers[i].contains("e")) {
		      fewV+=numbers[i]+" ";
		    }
		  }
		  String [] fewValues = fewV.split(" ");
		    
		    
		    //YOUR CODE ENDS HERE -----------------------
		    
		    return fewValues;
		  }
		  
		  }

