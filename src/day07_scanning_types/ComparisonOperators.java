package day07_scanning_types;

public class ComparisonOperators {
	public static void main(String[] args) {
		
		double balance = 150.0;
				
				boolean broke = balance <= 0.0;
		
		System.out.println("Broke? -" +broke);
		
		double transaction = 155.5;
		broke = (balance - transaction) < 0;
		System.out.println("Will make broke/negative? - "+broke);
		System.out.println("Balance: "+balance);
		System.out.println("Transaction: "+transaction);
	}

}
