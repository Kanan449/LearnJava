package day08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("###START THE PROGRAM##");
		System.out.println("What is your grade?");
		char grade = keyboard.next().toUpperCase().charAt(0);
		System.out.println("What is your score? ");
		int score = keyboard.nextInt();
		
		
		if(grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
		} else {
			System.out.println("How many points did you miss 'A'?");
			int points = keyboard.nextInt();
			System.out.println("You could earn "+ points+" more points if you study harder. ");
			
		}
		
		
		System.out.println("###END OF THE PROGRAM###");
	}

}
