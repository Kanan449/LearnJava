package day37_arraylist;
import java.util.*;
public class MyCities {
public static void main(String[] args) {
	ArrayList<String>cities = new ArrayList<>();
	
	cities.add("Barnaul");
	cities.add("Dushanbe");
	cities.add("Sterling");
	cities.add("Baku");
	cities.add("Tashkent");
	cities.add("Baku");
	//print each city using for each loop
	
	for(String name: cities) {
		System.out.print(name+" ");
	}
	
	//print each city using for loop
	
	System.out.println();
	for( int i = 0; i < cities.size(); i++) {
		System.out.print(cities.get(i)+" ");
	}
	
	//remove baku
	System.out.println();
	System.out.println("Removing Baku");
	cities.remove("Baku");
	System.out.println(cities.toString());
	
	//isEmpty?
	
	System.out.println("Is list empty? "+cities.isEmpty());
	
	cities.add(0, "Bishkek");
	System.out.println(cities.toString());
	cities.add(1, "Istanbul");
	System.out.println(cities.toString());
	
	cities.set(2, "Seoul");
	System.out.println(cities.toString());
	
	int idx = cities.indexOf("Sterling");
	cities.set(idx, "Astara");
	System.out.println(cities.toString());
	
	
	cities.clear();
	boolean isEmpty = cities.isEmpty();
	System.out.println("Is cities empty? "+isEmpty);
	System.out.println(18/100.0);
}
}
