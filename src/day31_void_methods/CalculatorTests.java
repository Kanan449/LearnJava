package day31_void_methods;

import java.util.Scanner;

import day30_methods02.Print5Stars;

public class CalculatorTests {
	public static void main(String[] args) {
		Calculator.add(34, 5);
		Calculator.multiply(3, 2);
		Print5Stars.print5Stars();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();

		System.out.println("Select operation: '+','-','*','/','%'");
		String operator = scan.next();
		switch (operator) {
		case "+":
			Calculator.add(n1, n2);
			break;
		case "-":
			Calculator.subtract(n1, n2);
			break;
		case "*":
			Calculator.multiply(n1, n2);
			break;
		case "/":
			Calculator.divide(n1, n2);
			break;
		case "%":
			Calculator.remainder(n1, n2);
			break;
		}

	}

}
