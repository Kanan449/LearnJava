package day35_java_review_session;

public class EncryptionFun {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		String word = "civic";
//	"e" --> "v"
//	"a" --> "z"
//	"s" --> "h"
//	"t" --> "g"
//	"e" --> "v"
//	"r" --> "i"

		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position:" + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);

		// with a loop
		String encryptedWord = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// find in alphabet
			int index = alphabet.indexOf(ch);
			// System.out.print(encrypted.charAt(index));
			encryptedWord += encrypted.charAt(index);

		}
		System.out.println(encryptedWord);
	}
}
