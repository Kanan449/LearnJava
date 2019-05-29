package day49_inheritance02;

public class BarnesAndNoble {
public static void main(String[] args) {
	
	Ebook ebuk = new Ebook();
	ebuk.setTitle("Intro to Java Programming");
	ebuk.setAuthor("Savitch");
	ebuk.setPages(1016);
	ebuk.setPrice(170);
	ebuk.setSize(500);
	ebuk.setType("Tech Book");
	
	
	System.out.println(ebuk.getTitle());
	System.out.println(ebuk.getAuthor());
	System.out.println(ebuk.getPrice());
	
	//If a parent class has encapsulated private variables, they are not directly inherited to child classes.
	//But child/sub classes can access private variables using getters and setters.
	
	AudioBook aBook = new AudioBook();
	aBook.setTitle("OCA Preparation");
	aBook.setAuthor("Jeanne");
	aBook.setNarrator("Marufjon");
	
	aBook.listen();
	
	System.out.println();
	
	PaperBack pb = new PaperBack();
	pb.setAuthor("Malcolm Gladwell");
	pb.setTitle("Outliers");
	pb.setType("Autobiography");
	pb.setPrice(20);
	pb.setPages(304);
	
	System.out.println(pb.toString());
	
	//What is inherited
	//- all public variable and methods
	//- all protected variables and methods
	//- all default variables 
	
	//Access modifiers
	//Public - visible to everyone
	//       - visible to subclass and non subclasses in same or other packages
	//Protected - visible to everyone in same package and only to sub classes in different packages
	
	//Default - visible to everyone in same package and none in different packages
	//Private  - visible to only class itself
	
	
	
	
}
}
