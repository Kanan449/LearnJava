package day30_methods02;

import java.util.Scanner;

public class rangePrint {
public static void main(String[] args) {
	
	range();
	
}
public static void range() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter first number: ");
	int num1 = scan.nextInt();
	System.out.println("Please enter second number: ");
	int num2 = scan.nextInt();
	if(num1 < num2) {
		for (int i = num1; i <=num2; i++) {
			System.out.println(i+" ");
		}
	}
	else if(num1>num2) {
		for (int k = num1; k>=num2; k--) {
			System.out.println(k+ " ");
		}
	}
	
	
}
}
