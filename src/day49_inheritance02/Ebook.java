package day49_inheritance02;

public class Ebook extends Book {
private double size;
private int pages;

public void readEBook(int pageNum) {
	//Reading Java book by Savitch at page 10
	System.out.println("Reading "+getTitle()+" by "+getAuthor()+" at page "+pageNum+".");
}


public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}

}
