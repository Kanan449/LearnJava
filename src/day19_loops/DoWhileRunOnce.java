package day19_loops;

public class DoWhileRunOnce {
public static void main(String[] args) {
	
	int count = 10;
	
	do {
		System.out.println("Count: "+count);
	    count++;
	}while(count<20);
}
}
//Do while body code will run once then test the condition. It ensures that your code runs at least once.
//Package name always lowercase