package day42_customclasses_encapsulation;

public class Person {
//declare name and age
	private String name;
	private int age;
	
	//getter and setter methods for name
	//getter is read only
	
	public String getName() {
		return name;
	}
	//write only method which is setter
	
	public void setName(String name) {
		this.name=name;
	}
}
