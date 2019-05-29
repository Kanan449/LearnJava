package day38_arraylist03;
import java.util.*;
public class MethodsSummary {
public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	
	list1.add("red");
	list1.add("blue");
	list1.add("white");
	list1.add("grey");
	list1.add("black");
	//add method with index adds the string to specified index
	list1.add(0, "yellow");
	
	//toString method to print all values in same line
	System.out.println(list1.toString());
	
	//size method returns number of values
	System.out.println("Number of elements: "+ list1.size());
	
	//get method returns value from index
	System.out.println("3: "+list1.get(3));
	System.out.println("0: "+list1.get(0));
	
	//remove using index.removes value from index position
	list1.remove(0);//removes "yellow" from the ArrayList
	System.out.println(list1.toString());
	
	//remove using value/element removes element first occurrence
	list1.remove("blue");//removes blue
	System.out.println(list1.toString());
	
	//set(index, value) replaces certain index with new value
	list1.set(0, "orange");
	System.out.println(list1.toString());
	
	//indexOf(value)returns index of value in the list
	System.out.println("grey: "+list1.indexOf("grey"));
	System.out.println("greenL "+list1.indexOf("green"));
	
	//isEmpty returns true if List is empty
	System.out.println("Is list empty? "+list1.isEmpty());
	System.out.println("Is list empty? "+(list1.size()== 0));
	
	//Contains (elem) ==> returns true if value is present
	System.out.println("White in list? - "+ list1.contains("white"));
	
	List<String> list2 = new ArrayList<>();
	list2.addAll(list1);
	System.out.println("list2: "+list2.toString());
	
	//Contains all check if list2 contains all the elements of list
	System.out.println("Contains all: "+list2.contains(list1));
	
	//Equals method check if lists are exactly equal
	System.out.println("Equals: "+list1.contains(list2));
	
	list2.add("pink");
	//Remove all
	list2.removeAll(list1);
	System.out.println("list2 after removeAll: "+list2);
	System.out.println("list1: "+list1);
	//ADDALL(index list) adds a new list of values starting from given index
	list2.addAll(0, list1);
	System.out.println("list2 after list1.addAll(0, list1): "+list2);
	
}
}
