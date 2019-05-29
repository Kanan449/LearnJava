package day49_inheritance02;

public class AudioBook extends Book {
private double length;
private String narrator;

public void listen() {
	//Listening to Java Book by Savitch narrated by Marufjon.
	System.out.println("Listening to "+getTitle()+ " by "+ getAuthor()+" narrated by "+getNarrator()+".");
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public String getNarrator() {
	return narrator;
}
public void setNarrator(String narrator) {
	this.narrator = narrator;
}


}
