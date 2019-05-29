package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	Double price;
	int calories;

	public void getCoffeInfo() {
		String info = name.toUpperCase() + " | " + size.toUpperCase() + " | " + price + " | " + calories + "CAL";
		System.out.println(info);
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("tall") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		}else {
			System.out.println("INVALID SIZE");
		}
	}

	public void setPrice(Double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCal) {
		calories = newCal;
	}
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		setPrice(newPrice);
		calories = newCal;
	}

}
