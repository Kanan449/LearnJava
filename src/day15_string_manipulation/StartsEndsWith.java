package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1= "eclipse";
		System.out.println(word1.startsWith("e"));
		
		System.out.println(word1.startsWith("ec"));
		
		System.out.println(word1.startsWith("ecli"));
		
		
		System.out.println(word1.startsWith("Ec"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("java"));
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));
	}

}
