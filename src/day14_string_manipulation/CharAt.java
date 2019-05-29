package day14_string_manipulation;

public class CharAt {
	public static void main(String[] args) {
		
		String word = "Computer";
		//print all characters one by one
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		//System.out.println(word.charAt(9));
		
		//String word2 and check if first character is 'J'
		
		String word2 = "ajava";
		
		if(word2.charAt(0)=='J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		//String word3 consists of 5 characters .
		//chech if first and lasr characters match
		
		
		String word3 = "agavaa";
		
		System.out.println(word3.length());
		
		if(word3.charAt(0)==word3.charAt(5)) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last are different");
		}
		
		//String word4 always print the last character no matter the length
		String word4 = "james";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println(word4.length());		
		System.out.println(lastChar);
		
		
	}

}
