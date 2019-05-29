package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double firstNumber, secondNumber, result = 0.0;
		String operator;
		
		System.out.println("Enter first number");
		firstNumber = scan.nextDouble();
		
		System.out.println("Select operator");
		operator = scan.next();
		
		System.out.println("Enter second number");
		secondNumber = scan.nextDouble();
		
		switch (operator) {
			case "+": 
		    System.out.println(firstNumber+secondNumber);
		break;
			case"-":
	        System.out.println(firstNumber-secondNumber);
	    break;
			case"*":
	        System.out.println(firstNumber*secondNumber);
	    break;
			case"/":
			System.out.println(firstNumber/secondNumber);
		break;
			case"%":
			System.out.println(firstNumber%secondNumber);
	        break;
	    default:
	    	System.out.println("Invalid operator");
		
		
		}	
		
	}
}