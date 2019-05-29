package day32_methods_within_methods;

public class Cooking {
	public static void main(String[] args) {
	makePancakes();
	System.out.println();
	makePasta();
	System.out.println();
	cook("Omelette","Eggs, Salt, Tomatoes, Onions, Gyro");	
		
		
		
	}
public static void cook(String dish, String ingredients) {
	System.out.println("~~~"+ dish.toUpperCase()+ " RECIPE~~");
	add(ingredients);
	System.out.println("Cook until it is cooked");
	System.out.println("~~"+dish.toUpperCase()+" IS READY!~~~");
}
	
	
public static void makePasta() {
	System.out.println("----ITALIAN PASTA RECIPE-----");
	add("Water, Salt, Olive oil");
	boil(2);
	add("Spaghetti Pasta");
	boil(9);
	mix(60);
	System.out.println("----DELICIOUS PASTA IS READY-----");
}
	
public static void makePancakes() {
	System.out.println("-----PANCAKE RECIPE-----");
	add("Milk, Eggs, Sugar, Flour, Salt");
	mix(120);
	fry(3);
	System.out.println("-----ENJOY YOUR DELICIOUS PANCAKES------");
}
	
public static void add(String ing) {
	System.out.println("Add " + ing);
}
public static void mix(int seconds) {
	System.out.println("Mix for "+seconds+" seconds");
}
public static void fry(int minutes) {
	System.out.println("Fry for "+minutes+" minutes");
}
public static void boil(int minutes) {
	System.out.println("Boil it for "+minutes+" minutes");
}
	
}
