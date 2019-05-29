package day41_customclasses02;

public class BMW {
String make="BMW";
String model;
int price;

public void showPrice() {
	if(model.equalsIgnoreCase("330i")) {
		price=40250;
	}else if(model.equalsIgnoreCase("740i")) {
		price=86450;
	}else if(model.equalsIgnoreCase("m3")) {
		price=66500;
	}
	System.out.println(price);
}
}
