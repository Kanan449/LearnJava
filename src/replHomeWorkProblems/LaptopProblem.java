package replHomeWorkProblems;

import java.util.*;

public class LaptopProblem {
  public static void main(String[] args) {
    double price = 0;
		String storageType, screenType, cpu, screenRes;
		int ram = 0, memorySize = 0 ;
		
		Scanner scan = new Scanner(System.in);
    System.out.println("Select screen size:");
    screenType = scan.nextLine();
    
    switch (screenType) {
      case "15.0":
        price= price+300;
        break;
      case "13.3":
        price= price+200;
        break;
      case "17.3":
        price= price+400;
        break;
    }
    
    System.out.println("Select CPU type:");
    cpu = scan.nextLine();
    
    switch (cpu) {
      case "i3":
        price=price+150;
        break;
      case "i5":
        price=price+250;
        break;
      case "i7":
        price=price+350;
        break;
    }
    
    System.out.println("Select RAM size:");
    ram = scan.nextInt();
    
    switch (ram) {
      case 4: price=price+50;
      break;
      case 8: price=price+100;
      break;
      case 12:price=price+150;
      break;
    }
    
    System.out.println("Select storage type:");
    storageType=scan.next();
    System.out.println("Enter memory size:");
    memorySize = scan.nextInt();
    
    if (storageType=="SSD") { 
    	if (memorySize==500) {
    		price=price+100;
    	}
        else if (memorySize==1000) {
        	price=price+200;
        	}
      
      }
    else if (storageType=="HDD") {
    	if (memorySize==500) {
    		price=price+50;
    	}
        else if (memorySize==1000) {
        	price=price+100;
        	}
      
       }
    
    
    System.out.println("Enter screen resolution:");
    screenRes=scan.next();
    
    switch (screenRes) {
      
    case "FULLHD":
    price= price+100;
    break;
    case "4K":
    price= price+200;
    break;
  }
    

    
    
    System.out.println("Laptop price is: $"+price);
    
  
    
      
      
    }
}



