package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hi, What is your name?");
	
	String name = scan.next();
	
	System.out.println("Nice to meet you, "+ name+"!");
}
}
