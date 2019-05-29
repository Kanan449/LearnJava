package day38_arraylist03;

import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		System.out.println(list1.toString());
		//copy all the values from list1
		ArrayList<String> month = new ArrayList<>(list1);
		System.out.println(month.toString());
		month.add("Jun");
		month.add("Jul");
		month.add("Aug");
		System.out.println(month.toString());
		System.out.println(month.contains("Jan"));
		System.out.println(month.contains("Dec"));
		System.out.println(month.contains("Jun"));
		
		//how would you check if Feb is in second position
		System.out.println(month.indexOf("Feb")==1);
		//if values of the list change  indexOd method will still display false, code might not behave as expected and it will be hard to point out the mistake
		System.out.println(month.get(1).equals("Feb"));
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		System.out.println("Month:"+month.toString());
		System.out.println("Month2:"+month2.toString());
		
		//check if month has all the values of Month2
		System.out.println(month.containsAll(month2));
		
		

	}
}
