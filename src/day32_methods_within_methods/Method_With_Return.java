package day32_methods_within_methods;

public class Method_With_Return {
public static void main(String[] args) {
	System.out.println(giveMe10$() );
	int i = giveMe10$();
	System.out.println(i);
	System.out.println(giveMeYourName());
	String myName = giveMeYourName();
	System.out.println("My name is "+giveMeYourName());
}
	
	
	
public static int giveMe10$() {
	System.out.println("Returning from 10");
	return 10;
}
public static String giveMeYourName() {
	String name = "Kanan";
	return name;
}








	
	
}
