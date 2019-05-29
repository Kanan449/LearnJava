package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int votingAge = 18;
		
		System.out.println("How old are you? ");
		
		int yourAge = keyboard.nextInt();
		int years = yourAge - votingAge;
		
		if (yourAge >= votingAge) 
		{ System.out.print("You are eligible to vote.");
			System.out.println(" You have been eligible for "+years+" years.");}
		else { System.out.println("You are not eligible.");
		System.out.println("You will be eligible in "+ 18%yourAge+" years.");
		}
		
	}
}
