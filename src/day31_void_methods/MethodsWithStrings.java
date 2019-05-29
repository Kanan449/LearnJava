package day31_void_methods;

public class MethodsWithStrings {
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults("About 121,000,000 results (0.51 seconds)");
}
 
	
	
	
	
	
	public static void countWords(String sentence) {
		String []newSen = sentence.split(" ");
	System.out.println("Number of words "+newSen.length);
	}
	
	
	
	public static void googleSearchResults(String results) {
		String[] newRes = results.split(" ");
		System.out.println("Results count: "+newRes[1].replace(",", " "));
		System.out.println("Time in seconds: "+newRes[3].substring(1, newRes[3].length()-1));
	}
}
