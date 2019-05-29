package day04_primitives_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		int yearOfBirth;
		yearOfBirth = 1989;
		int currentYear;
		currentYear = 2019;
		int age;
		age = currentYear - yearOfBirth;
		
		System.out.println(currentYear - yearOfBirth);
		
		System.out.println("If you are born in "+yearOfBirth+" then you are "+age+" years old.");
		
		System.out.println("In 2035 you will be "+ ( 2035 - yearOfBirth)+ " years old.");
	}

}
