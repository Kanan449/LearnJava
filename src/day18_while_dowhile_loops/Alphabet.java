package day18_while_dowhile_loops;

public class Alphabet {
public static void main(String[] args) throws InterruptedException {
	char letter = 'a';
	
	while(letter <= 'z') {
		System.out.print(letter+ " ");
		letter++;
	}
	
	System.out.println();
	
	
	char capitals = 'A';
	
	while(capitals <='Z') {
		System.out.print(capitals+" ");
		capitals++;
	}
	System.out.println();
	
	char jumbo = 'Z';
	
	while(jumbo>='A') {
		System.out.print(jumbo+" ");
		jumbo--;
	}
	
	System.out.println();
	
	String letters = "";
	
	char myLetter = 'A';
	
	while(myLetter <= 'Z') {
	letters = letters + myLetter;
	System.out.println(letters);
	myLetter++;
	}
	
	System.out.println();
	
	char yourLetter = 'a';
	
	
}
}
