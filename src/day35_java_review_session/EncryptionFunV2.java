package day35_java_review_session;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('b'));
		System.out.println(encryptChar('z'));
		
		String normal = "tesla";
		String encrypted = encryptWord(normal);
		System.out.println("normal: "+ normal+ "\n"+
		                   "encrypted: "+ encrypted);
		
		System.out.println("Encrypted Sentence: "+encryptSentence("java is fun"));
	}
	
	
	

	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		return encrypted.charAt(alphabet.indexOf(ch));

	}
	
	public static String encryptWord(String word) {
		String cyphered = "";
		for(int i = 0; i < word.length(); i++) {
			cyphered+=encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	
	public static String encryptSentence(String sentence) {
	     String [] arr = sentence.split(" ");
	     String encryptedSentence= "";
	     
	     for(String word:arr) {
	    	 encryptedSentence+=encryptWord(word)+" ";
	     }
	     return encryptedSentence;
	}
}
