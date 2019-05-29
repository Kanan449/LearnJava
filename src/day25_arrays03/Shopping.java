package day25_arrays03;

public class Shopping {
public static void main(String[] args) {
	
	String[] products = {"Timberland shoes", "H&M shirt", "Swatch Watch", "Gucci bag", "Adidas socks"};
	Double[] prices = {120.0, 5.99, 150.50, 3000.50, 6.99};
	int[] itemsId = {12345, 12346, 12347, 12348, 12349};
	
	
	
	//Print count of products
	//loop through products and print each one in separate line
	
	System.out.println(products.length);
	//Check if products , prices and itemsId have same count
	System.out.println();
	if(products.length == prices.length && products.length == itemsId.length) {
		System.out.println("Shopping list looks good");
	}
	else {
		System.out.println("Something is wrong in this list");
		return;
	}
	System.out.println();
	
	//Loop through products and print each one in separate line
	
	for (String product: products) {
		System.out.println(product);
	}
	System.out.println();
	for (int i =0; i<prices.length; i++) {
		System.out.println(prices[i]);
	}
	System.out.println();
	
	for (int idx = itemsId.length-1; idx>=0; idx--) {
		System.out.println(itemsId[idx]);
	}
	
	
	//print a receipt with a total price 
	//
	
	
	
	
	System.out.println("######## YOUR SHOPPING RECEIPT #########");
	for (int j = 0; j<prices.length; j++) {
		System.out.println("Item"+(j+1)+":"+ itemsId[j]+" - "+products[j]+" - $"+ prices[j]);
	}
	
	Double totalPrice = 0.0;
	
	for (int k = 0; k<products.length; k++) {
	totalPrice+=prices[k];
	}
	
	System.out.println("Total amount equals to : "+ totalPrice);
	
	//Find the most expensive item
	int maxIndex = 0;
	double maxPrice = 0;
	
	for (int f = 0; f<prices.length; f++) {
		if (prices[f]> maxPrice) {
			maxPrice = prices[f];
			maxIndex = f;
		}
	}
	System.out.println("####### MOST EXPENSIVE PRODUCT ########");
	System.out.println(itemsId[maxIndex]+ " - "+ products[maxIndex]+ " - $"+maxPrice);
	
	
	
	
	//TRY TO FIND THE CHEAPEST ITEM ON YOUR OWN
	
	
	
	
	
	
	
	
	
	
	
}
}
