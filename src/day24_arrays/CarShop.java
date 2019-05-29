package day24_arrays;

import java.util.Arrays;

public class CarShop {
public static void main(String[] args) {
	
	String cars[] = {"BMW", "Audi","Honda", "Mercedes", "Mercury","Rolls-Royce", "Tesla"};
	
	for (String car: cars) {
		if(car.startsWith("M")) {
			System.out.println(car);
		}
	}
	
	System.out.println();
	
//	
//	for (int i = 0 ; i< cars.length; i++) {
//		if (cars[i].startsWith("M")) {
//			System.out.println(cars[i]);
//		}
//	}
	
	for (String car: cars) {
		
		if(car.toLowerCase().contains("r")){
			System.out.println(car);
		}
	}
	
	System.out.println();
	
	for (String car: cars) {
		if (car.length()>=6) {
			System.out.println(car);
		}
	}
	
	
	String temp = cars[0];
	
	cars[0] = cars[cars.length-1];
	cars[cars.length-1]= temp;
	
	System.out.println(Arrays.toString(cars).replace("[", "").replace("]", ""));
	
	
	System.out.println("Before sorting");
	System.out.println(Arrays.toString(cars));
	Arrays.sort(cars);
	System.out.println("After sorting");
	System.out.println(Arrays.toString(cars));
	
	
	
	
	
	
	
}
}
