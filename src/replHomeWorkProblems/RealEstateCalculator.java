package replHomeWorkProblems;

import java.util.Scanner;

public class RealEstateCalculator {
	
			public static void main(String[] args) {
				int propertyPrice = 0; 
				int numberOfBedrooms, garageSpots = 0;
				float metroAccessibility = 0, schoolScore =0, highwayAccessibility =0;
				boolean backyard = true, smoking, garage = true;
				String houseType;
				Scanner scan = new Scanner(System.in);
				System.out.println("*****************************************");
				System.out.println("* Welcome to the RealEstate calculator! *");
				System.out.println("*****************************************");
				
				System.out.println("Enter your property type:");
				houseType=scan.next();
				switch(houseType) {
				case "condo":
					propertyPrice+=50000;
					break;
				case "townhouse":
					propertyPrice+=75000;
					break;
				case "single family home":
					propertyPrice+=95000;
				}
				System.out.println("How many bedrooms do you have?");
				numberOfBedrooms = scan.nextInt();
				switch (numberOfBedrooms) {
				case 1:
					propertyPrice+=30000;
					break;
				case 2:
					propertyPrice+=60000;
					break;
				case 3:
					propertyPrice+=90000;
					break;
				}
				
				System.out.println("Do you have a backyard?");
				if (houseType=="condo") { 
				  System.out.println("Backyard is not available for condo!");
				}
				else if (houseType=="Single Family Home" || houseType=="Townhouse") { 
					    backyard = scan.nextBoolean();
				      if (backyard) {
					    propertyPrice+=5000;
				    	}
				
				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();
				if (garage) { 
				  System.out.println("How many spots?");
				  garageSpots =scan.nextInt();
					switch (garageSpots) {
					case 1: propertyPrice+=20000;
					break;
					case 2: propertyPrice+=40000;
					break;
					case 3: propertyPrice+=60000;
					break;
					case 4: propertyPrice=propertyPrice+80000;
					break;
					case 5: propertyPrice=propertyPrice+100000;
					break;
					case 6: propertyPrice=propertyPrice+120000;
					break;
					case 7: propertyPrice=propertyPrice+140000;
					break;
					case 8: propertyPrice=propertyPrice+160000;
					break;
					case 9: propertyPrice=propertyPrice+180000;
					break;
					case 10: propertyPrice=propertyPrice+200000;
					break;
					case 20: System.out.println("Pardon,  it's not a public parking!");
					break;
				    }
				}
					
					System.out.println("How close is metro station?");
					metroAccessibility = scan.nextFloat();
					if (metroAccessibility<1) {
					propertyPrice=propertyPrice+10000;
					}
					else if (metroAccessibility>1 && metroAccessibility<3) {
						propertyPrice=propertyPrice+5000;
					}
					System.out.println("How close is highway?");
					highwayAccessibility=scan.nextFloat();
					
					if (highwayAccessibility<1) {
					propertyPrice=propertyPrice+15000;
					}
					else if (highwayAccessibility>1 && highwayAccessibility<5) {
					propertyPrice=propertyPrice+8000;
					}
					else if (highwayAccessibility>5 && highwayAccessibility<20) {
					propertyPrice=propertyPrice+4000;
					}
					
					System.out.println("What's the rating of nearest school?");
					schoolScore =scan.nextFloat();
					if (schoolScore>8 && schoolScore<10) {
					propertyPrice=propertyPrice+45000;
					}
					else if(schoolScore<4 && schoolScore>8) {
					propertyPrice=propertyPrice+20000;
					}
					else {
					propertyPrice=propertyPrice+5000;
					}
					
					System.out.println("Does any of your family members smoking?");
					smoking = scan.nextBoolean();
					if(smoking) { 
						propertyPrice=propertyPrice-5000;
					}

					System.out.println("Market report has been generated.");
					System.out.println("Your estimate market price is: "+propertyPrice+"$");
				
		
				}
			}
}