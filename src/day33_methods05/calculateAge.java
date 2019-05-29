package day33_methods05;

public class calculateAge {
	public static void main(String[] args) {

		age(1989, 2019);
		futureAge(1989, 2040);
		swimTime(129.43,3.7);
	}

	public static int age(int yearBorn, int currentYear) {
		int age = currentYear - yearBorn;
		if (age > 1 && age < 15) {
			System.out.println("Your age is " + age + " you are a child.");
		} else if (age >= 15 && age < 25) {
			System.out.println("Your age is " + age + " you are a youngster.");
		} else if (age >= 26 && age < 64) {
			System.out.println("Your age is " + age + " you are an adult.");
		} else if (age >= 65) {
			System.out.println("Your age is " + age + " you are a senior.");
		} else if (age < 0) {
			System.out.println("Invalid age");
		}
		return age;
	}
	
	public static int futureAge(int yearBorn, int futYear) {
		int futAge=futYear-yearBorn;
		System.out.println("In year "+futYear+" you will be "+futAge+" years old.");
		return futAge;
	}
	
	public static double swimTime(double distance, double averSwimSpeed) {
		double swimTime = distance/averSwimSpeed;
		System.out.println("You can swim from Turkmenbashi to Baku in "+swimTime+" hours.");
		return swimTime;
	}
	
	
	
}
