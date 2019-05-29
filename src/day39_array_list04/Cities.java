package day39_array_list04;
import java.util.*;
public class Cities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
    cities.add("Lima");
    
    for(String n:cities) {
    	System.out.print(n+" | ");
    }
    System.out.println();
    for(int i = 0; i < cities.size(); i++) {
    	System.out.print(cities.get(i)+" | ");
    }
    System.out.println();
    for(String k:cities) {
    	System.out.print(k.toUpperCase()+" | ");
    }
    System.out.println();
    for(int i = 0; i < cities.size(); i++) {
    	cities.set(i, cities.get(i).toUpperCase());
    }
    System.out.println(cities.toString());
    String longestCity = "";
    String shortestCity = cities.get(0);
    for(String n:cities) {
    	if(n.length()>longestCity.length()) {
    		longestCity = n;
    	}if(n.length()<longestCity.length()) {
    		shortestCity = n;
    	}
    }
    System.out.println();
    System.out.println("Longest city is: "+longestCity);
    System.out.println("Shortest city is: "+shortestCity);
    System.out.println();
    
    ArrayList <String> citiesMoreThan6 = new ArrayList<>();
    for(String ct:cities) {
    	if(ct.length()>5) {
    		citiesMoreThan6.add(ct);
    	}
    }
    System.out.println(citiesMoreThan6.toString());
}
}
