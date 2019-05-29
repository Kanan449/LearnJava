package day26_arrays04;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	
	String words = "java,kava,html,selenium";
	String wordsArray[] = words.split(",");
	
	System.out.println("Count of words in array: "+ wordsArray.length);
	System.out.println(wordsArray[0]);
	System.out.println(Arrays.toString(wordsArray));
	
	for(String word:wordsArray) {
		System.out.println(word);
	}
	
	String diceResult = "1 - 20 of 1,374 positions";
	
	String diceNresult[] = diceResult.split(" ");
	
	System.out.println(diceNresult[4]);
	
	
	String word = "java";
	
	char[] charsArray = word.toCharArray();
	
	for(char ch: charsArray) {
		System.out.print(ch+" ");
		
	}
	
	
	
}
}
