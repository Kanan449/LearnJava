package day23_loops_arrays;

public class Arrays {
public static void main(String[] args) {
	
	int[] numbers = new int[3];
    int num1 = 5;
    int num2 = 7;
    int num3 = 10;
    // assign to the first element in the array value of num1
    numbers[0] = num1;
    numbers[1] = num2;
    numbers[2] = num3;
    
    numbers[0] = 7;
    numbers[1] = 8;
//  we cannot provide different data type, we have to use data type of an array
//  numbers[2] = "A";
    
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println("*****************");
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}
}
