package day40_customclasses_methods;

public class MyContacts {
public static void main(String[] args) {
	Contacts contact1 = new Contacts();
	contact1.name = "Evgenia Jalilova";
	contact1.number = "(202) 333-4444";
	contact1.email = "evgenia@thorlabs.com";
	
	contact1.call();
	contact1.sendMessage();
	contact1.sendEmail();
	System.out.println();
	Contacts orhan = new Contacts();
	
	orhan.name = "Orhan Sultanov";
	orhan.number = "(571) 991-2323";
	orhan.email = "orhan@google.com";
	
	System.out.println("Name: "+ orhan.name);
	System.out.println("Phone number: "+orhan.number);
	System.out.println("Email: "+orhan.email);
	
	orhan.call();
	orhan.sendMessage();
	orhan.sendEmail();
	
	
	
}
}
