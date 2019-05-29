package day46_static_keyword;

public class CalculatorTest {
	public static void main(String[] args) {
		double result = Calculator.plus(55, 7);
		System.out.println("Result is: " + result);

		result = Calculator.minus(44, 14);

		Calculator cal1 = new Calculator();
		System.out.println(cal1.multiply(4, 2));
		
		//Static variables belong to class itself and can be called directly using a classname
		//
	}
}
