package day43_encapsulation_constructor;

public class TeslaDealer {
public static void main(String[] args) {
	Tesla tesla1 = new Tesla();
	tesla1.setModel("Model S");
	tesla1.setRange(310);
	tesla1.setZeroTo60(3.2);
	tesla1.setPrice(51.455);
	tesla1.setSelfDriving(true);
	
	
	System.out.println("Model: "+tesla1.getModel());
	System.out.println("Range: "+tesla1.getRange());
	System.out.println("Zero to 60: "+tesla1.getZeroTo60());
	System.out.println("Price: "+tesla1.getPrice());
	System.out.println("Autonomous: "+tesla1.isSelfDriving());
	
	tesla1.setModel("Model c");
	
	System.out.println(tesla1);
	System.out.println(tesla1.toString());
	
	Tesla tesla2 = new Tesla();
	tesla2.setInfo("Model X", 310, 2.6, 53.345, true);
	System.out.println(tesla2);
	System.out.println(tesla2.toString());
	
	buyTesla(tesla1);
	System.out.println(	testDrive("Model X"));
	Tesla tesla4 = testDrive("Model3");
	System.out.println(tesla4.toString());
}

public static Tesla testDrive(String model) {
	System.out.println("I would like to test drive - "+model);
	System.out.println("Sure, let me build the object and return it");
	Tesla tesla3 = new Tesla();
	tesla3.setInfo(model, 310, 2.5, 95000, false);
	return tesla3;
}


public static void buyTesla(Tesla car) {
	System.out.println("Purchasing: "+car.toString());
}
}
