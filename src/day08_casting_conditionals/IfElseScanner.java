package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseScanner {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	int passingPercentage, yourScorePercentage;
	
	passingPercentage = 65;
	
	
	System.out.println("Enter your score:");
	yourScorePercentage = scan.nextInt();
	
	
	
	if(yourScorePercentage >= passingPercentage) {
		System.out.println("You passed. Gongratulations!");
	}else { System.out.println("You failed! Study more! Don't be sad!");
	
	
	
	}
	
	System.out.println("Java is still fun");
	}}
