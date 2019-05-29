package day14_string_manipulation;

public class StringSIze {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		
		//Check if it matches "Good Morning" and print match
		//or not match
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		
		if(str1.equalsIgnoreCase("goog morning")) {
			System.out.println("Match - ignore case");
			}
		else {
			System.out.println("Not match - ignore case");
		}
//convert to all uppercase and print
	System.out.println(str1.toUpperCase());
	
//convert to all lowercase first then check if it equals ("good morning")
	
	if(str1.toLowerCase().equals("good morning")) {
		System.out.println("Chained methods: match");
	}else {
		System.out.println("Chained methods: do not match");
	}
	
//FIND OUT HOW MANY CHARACTERS IN THE NAME
	
	String myName = "Murodil";
	System.out.println(myName.length());
	
	int length = myName.length();
	System.out.println("My Name's length: "+length);
	
	
	
//usernames must be exactly 8 characters
	
	String userName = "password";
	
    if(userName.length()==8) {
    	System.out.println("Valid username");
    }else {
    	System.out.println("Invalid username, must be 8 characters");
    }
    
	
	
	String password = "woodenSpoon";
	
	if(password.length() >= 6) {
		System.out.println("Password is good");
	}else {
		System.out.println("Password is too short");
	}
	
	int passwordLength = password.length();
	
	if(passwordLength < 6) {
		System.out.println("Invalid password. Too short");
	}else {
		System.out.println("Valid password. Good job");
	}
	
	
	
		
	}

}
