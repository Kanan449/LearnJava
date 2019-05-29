package day41_customclasses02;

public class Microwave {
String brand;
boolean isOn;




public void turnOn() {
	if(isOn) {
		System.out.println("It is already on.");
	}else {
		System.out.println("Turning on "+brand+ " microwave");
		isOn=true;
	}
}
public void turnOff() {
	if(!isOn) {
		System.out.println(brand+ " microwave is already OFF");
	}else {
		System.out.println("Turning OFF"+brand+" microwave");
	}
}
public void heat(String food) {
	if(isOn) {
		System.out.println("Heating "+food);
	}else {
		System.out.println("Microwave is OFF, can not heat "+food);
	}
}
}
