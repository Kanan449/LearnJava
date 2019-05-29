package day49_inheritance02;

public class Leopard extends Animal {
public Leopard() {
	super();
	System.out.println("Leopard Constructor");
	setType("Leopard");
	
}

public Leopard( String type ) {
	
	super(type);
	System.out.println("Leopard one arg constructor");
}
}
