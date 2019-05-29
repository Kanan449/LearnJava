package day38_arraylist03;
import java.util.*;
public class CollectionSorting {
public static void main(String[] args) {
	
	List<Integer> numsList = new ArrayList<>();
	numsList.add(44);
	numsList.add(1);
	numsList.add(4);
	numsList.add(1000);
	numsList.add(3);
	System.out.println(numsList);
	
	System.out.println("Sorting... please wait...");
	Collections.sort(numsList);
	System.out.println(numsList.toString());
	
	List<String> strList = new ArrayList<>();
	strList.add("Fuad");
	strList.add("Roman");
	strList.add("Murad");
	strList.add("Muhabbat");
	strList.add("Maria");
	strList.add("Dina");
	strList.add("Bojan");
	strList.add("Anastasia");
	strList.add("Yaroslav");
	
	System.out.println(strList.toString());
	System.out.println("Sorting...please wait");
	Collections.sort(strList);
	System.out.println(strList.toString());
	
	System.out.println("Max number: "+Collections.max(numsList));
	System.out.println("Min number: "+Collections.min(numsList));
	
	String maxName = Collections.max(strList);
	String minName = Collections.min(strList);
	
	System.out.println("Max name is: "+maxName);
	System.out.println("Min name is: "+minName);
	
	Collections.shuffle(strList);
	
	System.out.println(strList);
	
}
}
