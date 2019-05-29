package replHomeWorkProblems;
import java.util.*;
public class Methods8_146 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String s) 
		{
		
			//your code here
			String [] name = s.split(",");
			String info = "person name:"+name[0]+" last name: "+name[1]+" age: "+name[2];
			System.out.println(info);
			}//end person
	  
	}
	
	
	
	
	
