package day42_customclasses_encapsulation;

import java.util.ArrayList;

public class ShoesDSWShoeStore {
public static void main(String[] args) {
	Shoes shoes1 = new Shoes();
	shoes1.setShoesData("ALDO", 6.5);
	System.out.println(shoes1.getShoesData());
	System.out.println();
	Shoes shoes2 = new Shoes();
	shoes2.setShoesData("Allen Edmons", 7.5);
	
	Shoes shoes3 = new Shoes();
	shoes3.setShoesData("HUGO BOSS", 9.0);
	
	
	
	Shoes[] shoesArray = new Shoes[3];
	shoesArray[0]=shoes1;
	shoesArray[1]=shoes2;
	shoesArray[2]=shoes3;
	
	System.out.println(shoesArray[0].getShoesData());
	System.out.println(shoesArray[1].getShoesData());
	System.out.println(shoesArray[2].getShoesData());
	
	System.out.println(shoesArray[0].brand);
	System.out.println(shoesArray[1].brand);
	System.out.println(shoesArray[2].brand);

	
	//ArrayList of shoes
	
	ArrayList<Shoes> myShoes=new ArrayList<>();
	
	myShoes.add(shoes1);
	myShoes.add(shoes2);
	myShoes.add(shoes3);
	
	System.out.println(myShoes.get(0).getShoesData());
	System.out.println(myShoes.get(1).getShoesData());
	System.out.println(myShoes.get(2).getShoesData());
	
	System.out.println();
	for(Shoes shoes :myShoes) {
		System.out.println(shoes.getShoesData());
	}
	System.out.println();
	///Print name of shoes in the list size is more than 7
	for(Shoes shoes :myShoes) {
		if(shoes.size>7.0) {
			System.out.println(shoes.getShoesData());
		}
	}
	
}
}
