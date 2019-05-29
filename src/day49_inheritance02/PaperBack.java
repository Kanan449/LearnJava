package day49_inheritance02;

public class PaperBack extends Book{
private int pages;

public String toString() {
	//Learning how to use encapsulation in inheritance.
	//title, author, price, type
	String a1 = "Title: "+getTitle()+" | Author: "+getAuthor()+" | Price: "+getPrice()+" | Type: "+getType()+" | Pages: "+getPages();
	return a1;
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}

}
