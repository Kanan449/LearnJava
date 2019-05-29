package day49_inheritance02_2;
import day49_inheritance02.Device;
public class Ipad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book "+ title+" using "+brand+" tablet");
	}
}
