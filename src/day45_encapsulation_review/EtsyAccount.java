package day45_encapsulation_review;
import java.util.*;
public class EtsyAccount {
    private String email;
    private String firstName;
    private String password;
    
    //constructor 1. No-args. sets all as empty string
    public EtsyAccount() {
        email     = "";
        firstName = "";
        password  = "";
    }
    
    //constructor 2. 
    //takes 3 args and sets them to instance variables,
    //using setters
    
    public EtsyAccount(String email, String firstName, String password) {
        setEmail(email);
        setFirstName(firstName);
        setPassword(password);
    }
    private String getRandomPassword() {
    	Random rd = new Random();
    	String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
    	String rdPassword = "";
    	for(int i = 0; i < 6; i++) {
    		rdPassword+=letters.charAt(rd.nextInt(letters.length()));
    	}
    	return rdPassword;
    }
    
    
    @Override
    public String toString() {
        return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        //if it contains @ somewhere in the middle. assign it 
        //if not print "Please enter a valid email address."
        if(email.indexOf("@") > 0 && email.indexOf('@') < email.length() -1 ) {
           this.email = email;
        }else {
           System.out.println("Please enter a valid email address.");
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        //Can't be blank.
        //needs to be only Alphabetic/letters
        if(isValidFirstName(firstName)) {
            this.firstName = firstName;
        }else {
            System.out.println("Your first name contains invalid characters.");
        }
    }
    /*
     * valid -> all letters , can have space in middle
     * invalid -> cannot contain numbers or any other chars
     */
    private boolean isValidFirstName(String firstName) {
        //check first if it starts with or ends with space
        //return false if true
        if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
            return false;
        }
        
        if(firstName.isEmpty()) {
            System.out.println("Cannot be blank.");
            return false;
        }
        
        for(int i = 0; i < firstName.length(); i++) {
            char ch = firstName.charAt(i); //  %
            if(!Character.isAlphabetic(ch) && ch !=' ') {
                return false;
            }
        }
        
        return true;
        
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password.length() < 6) {
            System.out.println("Must be at least 6 characters.");
        }else {
            this.password = password;
        }
    }
    
    
}
