package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPinCode {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int yourSecretPinCode = 4172;
int pincode = 0;

while(yourSecretPinCode!=pincode) {
	System.out.println("Enter Pincode");
	pincode=scan.nextInt();
	}
System.out.println("Acces granted select operation");






}
}
