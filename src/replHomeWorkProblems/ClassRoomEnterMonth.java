package replHomeWorkProblems;
import java.util.*;
public class ClassRoomEnterMonth {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int month;
	do {
		System.out.println("Enter month:");
		month = scan.nextInt();
		
	}while(month<=12);
	
	System.out.println("Invalid month");
	
	
}
}
