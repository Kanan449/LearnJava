package day46_static_keyword;

public class DinnerRestaurant {
public static void main(String[] args) {
	Dinner Mom = new Dinner();
	Dinner kid = new Dinner();
	Dinner dad = new Dinner();
	
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	System.out.println("Total slices: "+Dinner.pizzaSlices);
	System.out.println("Total slices: "+dad.pizzaSlices);
	
	kid.takeASlice(3);
	dad.takeASlice(2);
	
	Mom.takeASlice();
	
	System.out.println("Total slices: "+Dinner.pizzaSlices);
}
}
