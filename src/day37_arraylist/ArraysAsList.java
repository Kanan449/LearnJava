package day37_arraylist;
import java.util.*;
public class ArraysAsList {
public static void main(String[] args) {
	List<String> cars = new ArrayList <>();	
	cars.add("Honda"); //add more values
	//declare and add more values in single statement
	//Arrays class
	List<Integer>nums = Arrays.asList(4, 2, 5, 7, 8);
	System.out.println(nums.size());
	System.out.println(nums.toString());
	
	
	//create arraylist prices 
	//assign values using Arrays.aslist method
	
	
	List<Double>prices = Arrays.asList(3.5, 20.5, 55.1, 100.23, 231.23, 500.0, 1230.5, 9874.44, 34.4, 123.5);
	double sum = 0.0;
	for(double i:prices) {
		sum+=i;
	}
	System.out.println(sum);
	
	double sum2 = 0.0;
	
	for (int i  = 0; i < prices.size(); i++) {
		sum2+= prices.get(i);
		}
	System.out.println(sum2);
	
	//create new List expensive
	//add prices that are more than 100
	
	ArrayList<Double> expensive = new ArrayList<>();	
	for(double k : prices) {
		if(k > 100.0) {
			expensive.add(k);
		}
	}
	System.out.println(expensive.toString());
}
}
