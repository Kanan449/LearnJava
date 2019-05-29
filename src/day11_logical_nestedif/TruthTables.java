package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] args) {
		System.out.println("###### TRUTH TABLES FOR && OPERATOR #####");
		System.out.println("When true  && true - result is "+(true & true ));
		System.out.println("When true  && false - result is "+(true & false));
		System.out.println("When false && true -result is "+(false & true));
		System.out.println("When false && false -result is "+(false & false));
		
		System.out.println();
		
		System.out.println("##### TRUTH TABLE FOR || OPERATOR #####");
		System.out.println("When true  || true - result is "+(true || true));
		System.out.println("When true  || false _ result is "+ (true || false));
		System.out.println("When false || true - result is "+ (false||true));
		System.out.println("When true  || true -result is "+(true ||true));
		
		System.out.println();
		
		System.out.println("#####TRUTH TABLE FOR ! (NOT) OPERATOR #####");
		System.out.println("When !true -result is "+ (!true));
		System.out.println("When !false - result is "+(!false));
		
	}

}
