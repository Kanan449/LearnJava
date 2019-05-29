package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {
public static void main(String[] args) {
	
	int [] numbers = new int [3];
	numbers [0] = 5;
	numbers [1] = 10;
	numbers [2] = 20;
	
	System.out.println(numbers);
	//toString() from arrays class can help us to print an arrays as string 
	System.out.println(Arrays.toString(numbers));
	
	int sum = 0;
	
	for (int i = 0; i < numbers.length; i++) {
		sum+=numbers[i];
	}
	System.out.println("Sum equals to: "+sum);
	//find largest value in the array
	
	int max = Integer.MIN_VALUE;
	for (int i = 0; i<numbers.length; i++) {
		if (numbers[i] > max) {
			max = numbers [i];
			
		}
	}
	
	System.out.println("Max value: "+max);
	
	//Task find the minimum value in the array;
	
	int min = Integer.MAX_VALUE;
	
	for (int k = 0; k<numbers.length; k++) {
		if (numbers[k] < min) {
			min = numbers[k];
			
		}
	}
	System.out.println("Minimum value: "+min);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
