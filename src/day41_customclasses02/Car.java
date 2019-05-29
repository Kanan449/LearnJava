package day41_customclasses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		System.out.println(
				"Car make: " + make + " | Model: " + model + " | Color: " + color + " | CurrentSpeed: " + currentSpeed);
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(make + " " + model + " is driving at " + currentSpeed + "mph, following speed limit -"
					+ speedLimit);
		} else if (currentSpeed > speedLimit) {
			System.out.println(
					make + " " + model + " driving at " + currentSpeed + " MPH | over the speed limit - " + speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make+" "+model+" is driving.");
	}
	
	public void accelerate(int mph) {
		currentSpeed = currentSpeed+mph;
	}
	
	
}
