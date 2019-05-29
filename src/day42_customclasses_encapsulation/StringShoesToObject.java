package day42_customclasses_encapsulation;
import java.util.*;
public class StringShoesToObject {
public static void main(String[] args) {
	String data = "Bruno Magli,9.5";
	Shoes shoes4 = new Shoes();
	String [] arrData = data.split(",");
	shoes4.setShoesData(arrData[0], Double.valueOf(arrData[1]));
	System.out.println(shoes4.getShoesData());
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What shoes brand?");
	String brand = scan.next();
	System.out.println("What is your size?");
	Double size = scan.nextDouble();
	Shoes shoes5 = new Shoes();
	shoes5.setShoesData(brand, size);
	System.out.println(shoes5.getShoesData());
}
}
