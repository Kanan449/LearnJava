package day34_methods06;

public class MethodOverloading {
public static void main(String[] args) {
	
add(10, 20);
add("one", "two");
add(10.2, 8.2);
	
	
	
	
	
}	
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result: "+result);
	}
	
	public static void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println("Result: "+result);
	}
	
	public static void add(String str1, String str2) {
		String result = str1+str2;
		System.out.println("Result: "+result);
	}
	
	
}
