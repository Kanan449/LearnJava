package day46_static_keyword;

public class CustomerEbay {
public static void main(String[] args) {
	Customer cm1 = new Customer("Abdallah", "abdallah@gmail.com");
    Customer cm2 = new Customer("Adilet", "adilet@gmail.com");
    Customer cm3 = new Customer("Anastasia","anastasia@gmail.com");
    
    
    
    
    System.out.println(cm3.count);
    System.out.println(Customer.count);
    
    Customer cm4 = new Customer("Burak", "burak@yahoo.com");
    System.out.println("Total customers: "+Customer.count);
    
    cm1.count = 10;
    
    System.out.println(Customer.count);
}
}
