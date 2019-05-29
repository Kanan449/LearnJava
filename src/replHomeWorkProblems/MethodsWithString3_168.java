package replHomeWorkProblems;

public class MethodsWithString3_168 {
	public static void main(String[] args) {
	    System.out.println(coverString("[me]", "jo") ) ; 
	  }
	  
	  public static String coverString(String main, String coverME) {
	    if(main.contains(coverME)) {
	    	main=main.replace(coverME,"["+coverME+"]");
	    }else {
	    	main =main.replace(main, "["+main+"]");
	    }
	  
	
	  return main;
}
}