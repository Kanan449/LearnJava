package day16_string_manipulation;

public class GetNumberFromString {
public static void main(String[] args) {
	String sentence = "I wrote [236] lines of code today";
	int firstSign=sentence.indexOf("[")+1;
	System.out.println(firstSign);
	int lastSign=sentence.indexOf("]");
	String codeCount=sentence.substring(firstSign, lastSign);
	
	System.out.println(lastSign);
	System.out.println(sentence.substring(firstSign+1,lastSign));
	
	System.out.println(codeCount);
	
	
	int count = Integer.parseInt(codeCount);
	
	System.out.println(count);
	
	if (count > 20) {
		System.out.println("Wrote more than 20 lines of code Today");
	}else {
		System.out.println("Not enough coding found");	
		}
	
	
}
}

