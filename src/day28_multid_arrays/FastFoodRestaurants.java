package day28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		// read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);
		// print first row

		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length - 1]);

		// print each restaurant information is seperate line
		//int counter = 0;
		
		//for (String restaurant : data) {
		//	System.out.println("#"+counter+" "+restaurant);
		//	counter++;
		//}
		//print all restaurants in state of va
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
		
		int countVa = 0;
		for(String row: data) {
			if(row.contains(",VA,")) {
				System.out.println(row);
				countVa++;
				
			}
			
		}
		for(String row: data) {
		if(row.contains(",VA,")) {
			String [] cities = row.split(",");
			System.out.println(cities[2]+" - "+cities[1]);
		}
		}
		System.out.println(countVa);
		
		//Find all restaurant information in state of VA.
		//Print the restaurant names along with city name
		//Subway - Herndon
		
		
		
		
		

	}
}
