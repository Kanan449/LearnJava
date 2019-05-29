package day08_casting_conditionals;

import java.util.Scanner;

public class HabibMaterial {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("what is your name?");
	
	String name= scan.next();
	
	System.out.println("how old are you ? ");
	
	int age = scan.nextInt();
	
	System.out.println("Hi "+name+","+age);
	
	
	
	

}
}