package day32_methods_within_methods;

import java.util.Arrays;

public class ArrayParameters {
public static void main(String[] args) {
	int[]myArray = {44,22,66,11};
	printArray(myArray);
	
	int[]num1= {10,2,3};
	int[]num2= {3,1};
	System.out.println();
	print2Arrays(num1,num2);
	
	
	
	
}
	
	
	
public static void printArray(int[]nums) {
	for(int n: nums) {
		System.out.print(n+" ");
		
	}
}
public static void print2Arrays(int[]n1, int[]n2) {
	if(n1.length>n2.length) {
		printArray(n1);
		System.out.println();
		printArray(n2);
	}
	else {
		printArray(n2);
		printArray(n1);
	}
}
	
	
}
