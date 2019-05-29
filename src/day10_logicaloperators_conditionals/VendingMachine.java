package day10_logicaloperators_conditionals;
import java.util.*;

public class VendingMachine {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    
    int itemPrice;
    int quarters, dimes, nickels;
    
    System.out.println("Enter price in cents:");
    itemPrice = keyboard.nextInt();
    
    quarters = (100 - itemPrice)%25;
    dimes = (100 - itemPrice)%10;
    nickels = (100 - itemPrice)%5;
    
    if (itemPrice > 100) {System.out.println("Invalid price");
    }
    else if (itemPrice < 25) {System.out.println("Invalid price");
    }
    else if (itemPrice % 5 == 0) {System.out.println("Invalid price");
    }
    
    System.out.println("Your change is "+quarters+" , "+dimes+" dimes and "+nickels+" nickels.");
    
    
  
    
  
  }
}