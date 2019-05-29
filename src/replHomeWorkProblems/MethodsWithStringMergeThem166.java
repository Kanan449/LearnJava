package replHomeWorkProblems;

public class MethodsWithStringMergeThem166 {

	public static String mergeStrings(String one, String two) {
		  // char [] one1 = one.toCharArray();
		  // char [] two2 = two.toCharArray();
		   
		   int size = 0;
		   if(one.length()>two.length()){
		     size=one.length();
		   }else{
		     size=two.length();
		   }
		   
		  String newWord = ""; 
		  for(int i = 0; i < size; i++){
		      if(i<one.length()){
		        newWord+=one.charAt(i);
		      }
		      if(i<two.length()){
		        newWord+=two.charAt(i);
		      }
		        
		      }
		  return newWord;
	}
		    
		    
	
	
}
