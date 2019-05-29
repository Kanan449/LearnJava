package replHomeWorkProblems;
import java.util.*;
public class CarInsuranceQuote078 {
public static void main(String[] args) {
	    
	    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to the CountyFarm car insurance!");
	
	    System.out.println("Enter your name");
	    name = scan.nextLine();
	    System.out.println("Do you have a US driver license?");
	    String license = scan.next();
	    if (license.equalsIgnoreCase("no")) {
	    	System.out.println("Invalid data!");
	    	System.exit(0);
	    }
	    
	    System.out.println("Enter your zip code");
	    int zip = scan.nextInt();
	    if(zip==22102||zip==22103) {
	    	premium+=30;
	    }
	    else if (zip ==20910 || zip == 20740) {
	    	premium+=60;
	    }
	    else {
	    	premium+=50;
	    }
	    
	    System.out.println("Is this vehicle Owned, Financed, or Leased?");
	    vehicleOwnership= scan.next();
	    if (vehicleOwnership.equalsIgnoreCase("owned")) {
	    	premium+=10;
	    }
	    else {
	    	premium+=20;
	    }	

	    System.out.println("How is this vehicle primarily used?");
	    vehicleUsage= scan.next();
	    switch(vehicleUsage) {
	    case "Business": 
	    	premium+=50;
	    	break;
	    case "Pleasure":
	    	premium+=10;
	    	break;
	    case "Commute":
	    	premium+=20;
	    	break;
	    }
	    
	    if (vehicleUsage.equalsIgnoreCase("Commute")) {
	    System.out.println("Days Driven To Work And/Or School");
	    daysDrivenToWorkOrSchool= scan.nextInt();
	    premium+=daysDrivenToWorkOrSchool*5;
       
	    System.out.println("Miles Driven To Work And/Or School");
	    milesToWorkOrSchool= scan.nextInt();
	    premium+=milesToWorkOrSchool*1;
	    }
    
	    System.out.println("How old are you?");
	    int age= scan.nextInt();
	    if (age<16) {
	    	System.out.println("Invalid data!");
	    	System.exit(0);
	    }
	    else if (age>=16 && age<18) {
	    	premium*=20;
	    }
	    else if (age>=18 && age<=21) {
	    	premium*=6;
	    }
	    else if (age>21 && age<25) {
	    	premium*=2;
	    }
   
        System.out.println("How many years you've been driving?");
        int yearsDrive= scan.nextInt();
        if (age-yearsDrive<16) {
        	System.out.println("Invalid data!");
        	System.exit(0);
        }
        premium-=yearsDrive*5;	
    	    
        System.out.println("Have you had any accidents in the last 5 years?");
	    String accidents = scan.next();
	    if (accidents.equalsIgnoreCase("yes")) {
	    	System.out.println("How many?");
	    	accidentsAmount = scan.nextInt();
	    	double exAcc = premium*0.2;
	    	premium+=exAcc*accidentsAmount;
	    }
	 
	    System.out.println("Have you had continuous insurance for the past 12 months?");
	    continuousInsurance = scan.next();
	    if (continuousInsurance.equalsIgnoreCase("no")) {
	    	premium=premium*2;
	    }	
      
	    System.out.println("What is the highest level of education you have completed?");
	    scan.nextLine();
	    education= scan.nextLine().replaceAll(" ", "");
	    
	    if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")) {
	    	premium-=premium*0.05;
	    }
	    else if(education.equalsIgnoreCase("Doctors")) {
	    	premium-=premium*0.1;
	    }
	    else if (education.equalsIgnoreCase("lessthanhighschool")) {
	    	premium+=premium*0.05;
	    }
	    
	    System.out.println(name+", here's your quote!");
	    System.out.println("Start Your Policy Today For: $"+premium);
	    
	    
	    int nameL = name.length();
	    referenceNumber = name.substring(0,2).toUpperCase()+age+name.substring(nameL-2).toUpperCase()+zip+education.toUpperCase();
	    
	    System.out.println("Reference number: "+referenceNumber);
	    
	    
	
	
}
}
