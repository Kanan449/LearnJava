package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
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
		
		
        if (operator.equals("+")) {
        	result = firstNumber+secondNumber;
        	}
        else if (operator.equals("-")) {
        	result = firstNumber-secondNumber;
            }
        else if (operator.equals("*")) {
        	result = firstNumber*secondNumber;
        }
        else if (operator.equals("/")) {
        	result =firstNumber/secondNumber;
        }
        else if (operator.equals("%")) {
        	result =firstNumber%secondNumber;
        }
        else {
        	System.out.println("Invalid operator selected: "+operator);
        	return; //DO NOT EXECUTE, STOP EXECUTING
        }
		
        System.out.println("The result is: "+result);
		
		
	}

}
