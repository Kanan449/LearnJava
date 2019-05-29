package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("Which type of car are you interested in?");
    
			
	System.out.println(" 1) American\n 2)Japanese\n 3)German\n 4)Italian\n 5)Korean");
	int carType=scan.nextInt();
	
	double averagePrice = 0.0;
	String carOptions ="";
	String carOrigin ="";
	
	switch (carType) {
	case 1: averagePrice = 33000.0;
	        carOptions = "Ford, Dodge, Tesla,Chevrolet, Lincoln";
	        carOrigin = "American";
	        break;
	        }
	
	System.out.println("You selected "+carOrigin+" car"+" and your car options are "+carOptions+".");
	System.out.println("Your average price is "+averagePrice);
			

		
	}

	
	}


