package replHomeWorkProblems;
import java.util.*;
public class ParseJsonFile098 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		int firstN = json.indexOf("firstName");
		int role = json.indexOf("\"role");
		
		
		String newJson = json.substring(firstN, role);
		newJson = newJson.replace("firstName\":","").replace("\"lastName\":","").trim();
		
		int wordL = newJson.length();
		
		while (newJson.contains("\"")) {
		newJson=newJson.replaceFirst("\"", "").replace(",", "").trim();
		}
		int spaceN = newJson.indexOf(" ");
		String firstName = newJson.substring(0, spaceN);
		String lastName = newJson.substring(spaceN+2);
		
		
		
	    System.out.println("First name: "+firstName);
	    System.out.println("Last name: "+lastName);
	
	
	
	
	
	
	
}
}
