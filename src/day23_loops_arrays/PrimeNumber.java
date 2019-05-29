package day23_loops_arrays;
import java.util.*;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
	int count= 0;
	for (int i = 2; i < num; i++) {
		
		if (num%i==0) {
			count++;
		}
		
	}
	
	if (count>=1) {
		System.out.println("This is not a prime number");
	}
	else {
		System.out.println("Prime number");
	}
	
}
}

