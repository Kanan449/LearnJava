package replHomeWorkProblems;

import java.util.*;

public class MethodsWithStrings_186 {
	public static void main(String[] args){
	       ArrayList<String> wordList = new ArrayList<String>();
	       wordList.add("hi");
	       wordList.add("hey");
	       wordList.add("hi");
	       wordList.add("yo");
	       
	       removeAll(wordList, "hi");
	System.out.println(wordList.toString());
	     }
	
	
	public static String extractNum(String s) {
		String n1="";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				n1+=s.charAt(i)+"";
			}
		}
	return n1;	
	}
	
	public static void removeAll(ArrayList<String>wordList, String targetWord){
		  for(String n1:wordList){
		    if(n1.equalsIgnoreCase(targetWord)){
		      wordList.remove(n1);
		    }
		  }
		}
	
	
	
	
}
