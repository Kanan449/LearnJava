package replHomeWorkProblems;
import java.util.*;
public class ShoppingList085 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String continued = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			
			
			
			do{ System.out.println("Enter Item"+count+" and its price:");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport += "Item"+count+": "+item+" Price: "+price+", "; 
			System.out.println("Add one more item?");
			continued= scan.next();
			count++;
			totalPrice+=price;
			}while (continued.equalsIgnoreCase("Yes")&&count<=10);
		
		int lengthReport = shoppingListReport.length();
			
		if (count>1) {
			  shoppingListReport= shoppingListReport.substring(0, lengthReport-2);
			}
			
		System.out.println(shoppingListReport)	;
		System.out.println("Total price: "+totalPrice);
		
		
	  }
	}
