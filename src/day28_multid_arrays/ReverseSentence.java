package day28_multid_arrays;

public class ReverseSentence {
public static void main(String[] args) {
	String sentence = "You are very interesting person";
	
	String[] nSentence = sentence.split(" ");
	
	for(int i = nSentence.length-1; i >= 0; i--) {
		System.out.print(nSentence[i]+" ");
	}
	
	
	
	
	
}
}
