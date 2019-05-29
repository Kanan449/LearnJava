package replHomeWorkProblems;

import java.util.*;

public class Party083 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
	    String guest = "";
	    String newGuest = "";
	    System.out.println("Please enter guest name:");
	    guest=input.next();
	    System.out.println("Do you want to enter new guest name:");
	    answer = input.next();
	    
	    while(answer.equalsIgnoreCase("Yes")) {
	      System.out.println("Please enter guest name:");
	      newGuest=input.next();
	      System.out.println("Do you want to enter new guest name:");
	    answer = input.next();
	      
	      guest+=", "+newGuest;
	    }
	    
	    System.out.println("Guest's list: "+guest);
	    
	    
	    
	    String yesNo = input.next();
	    boolean answer1;
	   // if (yesNo.equals("Yes")) {
	   // = true;
	   // }
	   // else {
	   // 	answer1 =false;
	  //  }
	    
	    
	    answer1 =(yesNo.equalsIgnoreCase("yes")) ? true: false;
	    
	    
	  }
	}