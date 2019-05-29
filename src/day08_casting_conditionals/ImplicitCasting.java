package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		//automatic casting from small type to larger type
		short shortValue = 3455;
		int intValue = shortValue;
		//int intValue = (Int)shortValue  optional//
		
		double price = 345;
		System.out.println("Price after casting: "+price);
		
		int price1 = 34563;
		
		double dPrice = price1;
		
		System.out.println("Price after casting: "+ dPrice);
		
	}

}
