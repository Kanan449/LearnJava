package replHomeWorkProblems;

import java.util.Scanner;

public class TipApplicator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	boolean split;
	int numOfPeople = 0;
	double totalPay = 0, totalTip = 0, totalPerPerson, tipPerPerson, checkAmount;
    
    System.out.println("TIP APPLICATOR");
    System.out.println("Split?");
    String splitYesNo = scan.next();
    if (splitYesNo.equalsIgnoreCase("Yes")) {
    	System.out.println("Number of people:");
    	numOfPeople= scan.nextInt();
    }else if (splitYesNo.equalsIgnoreCase("No")) {
    	numOfPeople=1;
    }
    
    System.out.println("Check amount:");	
    checkAmount= scan.nextDouble();
    System.out.println("Service Quality");
    String serviceQuality=scan.next();
    
    if (serviceQuality.equalsIgnoreCase("Poor")) {
      totalTip= checkAmount*0.05;
    } else if (serviceQuality.equalsIgnoreCase("Fair")) {
      totalTip= checkAmount*0.10;
    }else if (serviceQuality.equalsIgnoreCase("Good")) {
      totalTip= checkAmount*0.15;
    }else if (serviceQuality.equalsIgnoreCase("Excellent")) {
      totalTip= checkAmount*0.25;
    }else if (serviceQuality.equalsIgnoreCase("Great")) {
        totalTip= checkAmount*0.20;
      }
    
    if (numOfPeople==1) {
        System.out.println("Number of People :&");
      }else if (numOfPeople==2) {
        System.out.println("Number of People :&&");
      }else if (numOfPeople==3) {
        System.out.println("Number of People :&&&");
      }else if (numOfPeople==4) {
        System.out.println("Number of People :&&&&");
      }else if (numOfPeople==5) {
        System.out.println("Number of People :&&&&&");
      }else if (numOfPeople==6) {
        System.out.println("Number of People :&&&&&&");
      }else if (numOfPeople==7) {
        System.out.println("Number of People :&&&&&&&");
      }else if (numOfPeople==8) {
        System.out.println("Number of People :&&&&&&&&");
      }else if (numOfPeople==9) {
        System.out.println("Number of People :&&&&&&&&&");
      }else if (numOfPeople==10) {
        System.out.println("Number of People :&&&&&&&&&&");  
     }    
     totalPay=checkAmount+totalTip;
	 totalPerPerson=totalPay/numOfPeople;
	 tipPerPerson=totalTip/numOfPeople;
    
     System.out.println("Total to pay: "+totalPay);
     System.out.println("Total tip: "+totalTip);
     System.out.println("Total per person: "+totalPerPerson);
     System.out.println("Tip per person: "+tipPerPerson);
	
	
	
	
	
}
}
