package day07_scanning_types;

import java.util.Scanner;

public class phoneNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your area code:");
		int areaCode, localNumber;
	    areaCode = scan.nextInt();
	    System.out.println("Enter local number");
	    localNumber = scan.nextInt();
	    
	    String phoneNumber = "("+areaCode+")-"+localNumber;
	    
	    System.out.println("Calling Number "+phoneNumber);
	    
	    
	    
	    
	}

}
