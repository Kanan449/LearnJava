package day07_scanning_types;

import java.util.Scanner;

public class AssigmentComplicated {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);

	String item1, item2, item3, report;
	
	double price1, price2, price3, totalPrice;
	
	
	System.out.println("Enter item 1 and it's price: ");
	
	item1 = scan.next();
	price1 = scan.nextDouble();
	
	System.out.println("Enter item 2 and it's price: ");
	
	item2 = scan.next();
	price2 = scan.nextDouble();
	
	System.out.println("Enter item3 and it's price: ");
	
	item3 = scan.next();
	price3 = scan.nextDouble();
	
	double sum = price1+ price2+ price3;

	
	
	System.out.println("Item1: "+item1+";"+price1+", "+"Item2: "+item2+";"+price2+", "+"Item3: "+item3+";"+price3+", "+"Totall price: "+ sum);
	
	}	
	
	}
