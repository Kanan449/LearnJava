package day16_string_manipulation;

public class CapitalCity {
public static void main(String[] args) {
	String str = "Moscow is capital of Russia";
	
	str= str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
	
	System.out.println(str);

	String email = "firstNamelastName@gmail.com";
	
    String company = "deloitte";
    
    String newEmail=email.replace("gmail", company);
    
    System.out.println(newEmail);
	
	
	
	
}
}
