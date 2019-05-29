package day11_logical_nestedif;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		boolean b1 = 50 > 10 && 10 >100;
		System.out.println("b1= "+b1);
		
		boolean b2 = 'a' == 'a' && 123>120;
		System.out.println("b2= "+b2);
		
		boolean b3 = true && 10>= 10 && 1000 <=900;
		System.out.println("b3= "+b3);
		
		boolean b4 = false && false && 10 == 10;
		System.out.println("b4= "+b4);
		
		boolean b5 = false || true && 10 == 10;
		System.out.println("b5= "+b5);
		
		
		
	}

}
