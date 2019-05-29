package replHomeWorkProblems;

import java.util.Scanner;

public class Email073 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    int underScore=email.indexOf("_");
	    int atSign=email.indexOf("@");
	    int dotIndex=email.indexOf(".");
	    String firstName=email.substring(0,underScore);
	    String lastName=email.substring(underScore+1,atSign);
	    String domainName=email.substring(atSign+1,dotIndex);
	    String topLevelDomain=email.substring(dotIndex);
	    
	    //String s1=firstName.charAt(0).toUpperCase();
	    String upperName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
	   // String s2=lastName.charAt(0).toUpperCase();
        String upperLast = lastName.substring(0,1).toUpperCase()+lastName.substring(1);	    
	    
        System.out.println("First name: "+upperName);
	    System.out.println("Last name: "+upperLast);
	    System.out.println("Domain: "+domainName);
	    System.out.println("Top-Level Domain: "+topLevelDomain);
	    
	    
	    
	    
	  }
	}


