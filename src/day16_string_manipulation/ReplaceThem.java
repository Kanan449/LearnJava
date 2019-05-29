package day16_string_manipulation;

public class ReplaceThem {
/**
 * @param args
 */
public static void main(String[] args) {
	String sentence = "Coding is fun, it is my hobby !!";
	String withNoSpaces= sentence.replace(" ", "");
	String commaSentence= sentence.replace(",","!!!");
	System.out.println(withNoSpaces);
	
	System.out.println(commaSentence);

	String mixed = "&^@#$ja-v|a@#$";
	
    mixed = mixed.replace("&^@#","");
    
    System.out.println(mixed);
    
    mixed=mixed.replace("@#$", "");
    
    System.out.println(mixed);
    
    mixed=mixed.replace("$", "").replace("-", "").replace("|", "");
    
    System.out.println(mixed);
    
    mixed=mixed.replace("a", "");
    
    System.out.println(mixed);
    
    String result="About 95,000,000 results (0.47 seconds)";
    
    System.out.println(result.indexOf(" result"));
    
    result= result.substring(result.indexOf("9"), result.indexOf(" result"));

	System.out.println(result);
	
    result=result.replaceFirst(",", "");
    System.out.println(result);
	
	
	
	
}
}
