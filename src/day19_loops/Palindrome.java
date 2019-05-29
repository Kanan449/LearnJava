package day19_loops;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String word = scan.next();
	String reversed = "";
	int idx=word.length()-1;
	
	while (idx>=0) {
		reversed += word.charAt(idx);
		idx--;
	
		
	}
	
	System.out.println(reversed);	
}
}