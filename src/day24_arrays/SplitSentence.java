package day24_arrays;

public class SplitSentence {
public static void main(String[] args) {
	String sentence = "Java is a general-purpose computer-programming "+
                       "language that is concurrent, class-based, object-oriented,"+
			           "and specifically designed to have as "+
                       "few implementation dependencies as possible.";
	int counter = 0;
	String [] words = sentence.split(" ");
	
	for (String str: words) {
		System.out.println(str);
	}
	
	
	System.out.println(words[0]);
	

	
	for (String str:words) {
		if(str.equals("language")) {
			break;
		}
		counter++;
	}
	
	System.out.println("Position: "+counter);
	System.out.println(words[counter]);
	
	
	
	
}
}
