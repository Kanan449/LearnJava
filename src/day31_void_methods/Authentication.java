package day31_void_methods;

public class Authentication {
	public static void main(String[] args) {
	authentication("mentoring@cybertekschool.com", "mentor001");	
		
		
		
	}
	
	
	
	public static void authentication(String username, String password) {
    String validUsername = "mentoring@cybertekschool.com";
    String validPassword = "mentor001";
    if(username.equals(validUsername)&&password.equals(validPassword)) {
    	System.out.println("Login Succesfull! Welcome to Okta");
    }
    else { 
    	System.out.println("Sign in failed!!!");
    }
    
	}
	
	
	
	
	
}
