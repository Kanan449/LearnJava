package day19_loops;
import java.util.*;
public class PrintLetters {
public static void main(String[] args) {
	String word = "Amazon";
	int idx = 0;
	int wordL = word.length();
	while(idx<wordL) {
		System.out.println(word.charAt(idx)+" ");
		++idx;
		
	}
	
	System.out.println();
	
	int idx2 = word.length() - 1;
	
	while(idx2>=0) {
		System.out.print(word.charAt(idx2));
		idx2--;
	}
	
	
	
	
	
	
}
}
