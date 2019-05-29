package day19_loops;
import java.util.*;
public class GuessANumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Random random = new Random();
	
	int secretNumber = random.nextInt(101);
	int guessNumber=0;
	int count = 0;
	
	do {
		System.out.println("Enter your number: ");
		guessNumber=scan.nextInt();
		count++;
		if (guessNumber>secretNumber) {
			System.out.println("Your number is too big");
		}
		else if (guessNumber<secretNumber) {
			System.out.println("Your number is too small");
		}
	}while(secretNumber!=guessNumber&&count<5);
	
	if (count>=5) {
		System.out.println("You are out of attempts. You lost!");
	}
	else {
		System.out.println("You won!!");
	}
}
}
