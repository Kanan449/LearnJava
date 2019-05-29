package day20_for_loop;

public class PrintEachChar {
public static void main(String[] args) {
	String word = "Cybertek";
	
	for (int i = 0; i<word.length(); i++) {
		System.out.println(word.charAt(i));
	}
	
	System.out.println();
	
	for (int i = 0; i<word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if(letter == 'a'|| letter == 'e'|| letter == 'o'|| letter == 'i'|| letter == 'u') {
			System.out.println(letter+ ", ");
		}
	}
	
	System.out.println();
	
	for (int i = 0; i<word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if(letter != 'a'&& letter != 'e'&& letter != 'o'&& letter != 'i'&& letter != 'u') {
			System.out.println(letter+ ", ");
	}
	}
	
}
}
