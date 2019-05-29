package replHomeWorkProblems;

public class MethodsWithString2Unique_167 {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    String uniqueChars ="";
	   
	      for(int k = 0; k < str.length(); k++){
	        if(!(uniqueChars.contains(str.charAt(k)+""))){
	        	uniqueChars+=str.charAt(k);
	        }
	     }
	      return uniqueChars;
	}
}
