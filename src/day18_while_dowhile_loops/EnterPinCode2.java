package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPinCode2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
int secretPincode = 4172;

int pincode = 0;

int attempts = 0;

while (secretPincode != pincode && attempts <= 3) {
	System.out.print("Enter again");
    pincode = scan.nextInt();
    attempts++;
    
    if (attempts == 3 && secretPincode != pincode) {
    	System.out.println("card is blocked");
    	return;
    }
}
	System.out.println("Acces granted. Select operation");
	
	
	
	
	
	
}
}
