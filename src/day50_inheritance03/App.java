package day50_inheritance03;

public class App {
	
private String name;
public static int count;


public App(String name) {
	this.name=name;
}

public static void build(String language) {
	System.out.println("Building apps using " +language);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
}
