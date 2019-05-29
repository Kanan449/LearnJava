package day40_customclasses_methods;

public class Contacts {
	//Instance variables
	
String name;
String number;
String email;

    //Behavior | Instance variable

public void call() {
	System.out.println("Calling"+name+".......");
}
public void sendMessage() {
	System.out.println("Sending message"+number+" to "+name+".......");
}
public void sendEmail() {
	System.out.println("Sending email"+email+" to "+name +"........");
}
}
