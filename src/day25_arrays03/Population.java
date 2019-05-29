package day25_arrays03;

public class Population {
public static void main(String[] args) {
	
	int [] population = new int[5];
	
	population[0] = 5000;
	population[1] = 10000;
	population[2] = 7000;
	population[3] = 4455;
	population[4] = 8907;
	
	
	// int[] population = {5000, 10000, 7000, 4455, 8907};
	
	System.out.println(population[0]);
	
	String str = "abc";
	
	System.out.println(population[str.length()]);
	
	
	
	
	
	String [] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
	
	//Population of Miami is 5000
	//Population of London is 10000
	//Population of Tokyo is 7000
	//Population of Rome is 4455
	//Population of New York is 8907
	
	System.out.println("Population of "+cities[0]+" is "+population[0]);
	
	
	
	
	
}
}
