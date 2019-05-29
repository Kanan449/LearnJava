package replHomeWorkProblems;
import java.util.*;
public class ArrayWithMethods_181 {
	public static void Main(String[] args){
	  String [] n1 = {"cat", "dog","rat"};
	  String [] n2 = {"lion","elephant", "bear"};
	  System.out.println(combineRs(n1, n2));
	  
	  }
	  public static String combineRs(String[] r1,String[] r2) 
	  {
	  List<String> r11 = new ArrayList<>();
	  List<String> r22 = new ArrayList<>();
	  for(String k:r1){
	    r11.add(k);
	  }
	  
	  for(String j:r2){
	    r22.add(j);
	  } 
	  
	  r11.addAll(r22);
	  
	  String str = "";
	  
	  for(String r:r11){
	    str+=r;
	  }
	  return str;
	  } 
	}
	  
	  

