package day07_scanning_types;

import java.util.Scanner;

public class LearningScanner {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, sum;
			
			System.out.println("Enter 3 numers: ");
			
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			sum = num1+num2+num3;
			
			System.out.println("Sum of 3 numers is: "+sum);
		
		
	}

}
