package day43_encapsulation_constructor;

public class ComputerMicroCenter {
public static void main(String[] args) {
	Computer comp1 = new Computer();
	Computer comp2 = new Computer();
	
	System.out.println(comp1.toString());
	System.out.println(comp2.toString());
	
	comp1.setBrand("IMAC");
	comp1.setOs("HIGH SIERRA");
	comp1.setPrice(2567);
	
	System.out.println(comp1.toString());
	
	comp2.setBrand("DELL XPS");
	comp2.setOs("WINDOWS10");
	comp2.setPrice(1300.0);
	
	System.out.println(comp2.toString());
	
	Computer comp3 = new Computer("ASUS", "WINDOWS7", 1234.3);
	System.out.println(comp3.toString());
	comp3.setOs("WINDOWS10");
	System.out.println(comp3.toString());
	comp3.setPrice(comp3.getPrice()-200.0);
	System.out.println(comp3.toString());
	
}
}
