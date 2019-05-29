package day19_loops;
import java.util.*;
public class EnterPassword {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String password = "abc123";
	String input;
	int count =0;
	
	do {
		System.out.println("Enter password");
		input = scan.next();
		++count;
		if(input.equals(password)) {
			System.out.println("Correct entry");
		}
	}while(!input.equals(password)&&count<3);
	
	System.out.println("You are out of attempts");
}
}

