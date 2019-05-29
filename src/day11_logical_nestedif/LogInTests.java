package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {
	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
    String userName, password;

 
	String validUsername = "knn@gmail.com";
    String validPassword = "knn1234";
    
    System.out.println("Please enter username:");
    userName = scan.nextLine();
    System.out.println("Please enter password:");
    password = scan.nextLine();
    
    if (userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {System.out.println("Login Successful, Welcome");
    }
    else if (!userName.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {System.out.println("Invalid username and password");
    }
    else if (userName.equalsIgnoreCase(validUsername) || !password.equals(validPassword)) {System.out.println("Invalid password");
    }
    else if (!userName.equalsIgnoreCase(validUsername) || password.equals(validPassword)) {System.out.println("Invalid username");
    }
   

	
	
	
	
	
	
	
	
	
	
}	
}
