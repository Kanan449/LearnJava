package day47_blocks;

import java.time.LocalDateTime;

public class BriteErp {
	static {
		
		//Static block runs once whenever the class is used(creating object call static method
		//Static block runs whenever a class is loaded for use
		
        System.out.println("Launch Browser");
        System.out.println("Navigate to: "+TestData.url);
        System.out.println();
        
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: "+TestData.email);
		
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: "+TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected name: "+ TestData.userName);
		System.out.println("Actual name displayed: Viktoria Lugovska");
		System.out.println("Login Successful"+LocalDateTime.now());
	}
	
	
	
	
}
