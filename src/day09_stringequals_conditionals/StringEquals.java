package day09_stringequals_conditionals;

public class StringEquals {
	
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == "java");
		System.out.println(str2 == "Java");
		
		//equals method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str2.equals("Java"));
		
		//2 ways to create strings 
		//  1)The way we have been using just assigning the value in double quotes
		//    String = "Tuesday"
		
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month==month2);
		
		System.out.println(month.equals(month2));
		System.out.println(month.equals("March"));
		
	}

}
