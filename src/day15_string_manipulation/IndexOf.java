package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf("g"));//0
		System.out.println(word1.indexOf('g'));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3
		
		System.out.println(word1.indexOf("java"));//-1
		
		
		String url ="www.okta.com";
		int index =url.indexOf(".");
		
		System.out.println(url.indexOf('.'));
		
		System.out.println(url.lastIndexOf('.'));
		
		System.out.println(url.charAt(index+1));
		
		String title = "Java - search";
		
		int dash= title.indexOf('-');
		
		System.out.println(title.charAt(dash -1 ));
		System.out.println(title.charAt(dash +1));
		
		String country= "United States of America";
		
		int states = country.indexOf("States");
		
		System.out.println("Position of states: "+states);
		
		
		
		String word2 = "java, c++,";
		
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		//- equals
		//- equalsIgnoreCase
		//- toLowerCAse
		//- toUpperCase
		//- charAt
		//- length
		//- startsWith
		//- endsWith
		//- contains
		//- indexOf
		//- lastIndexOf
		//- substring
		
		
		
	}

}
