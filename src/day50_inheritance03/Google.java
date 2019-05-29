package day50_inheritance03;

public class Google extends SearchEngine {
	public int search(String item) {
		System.out.println("Searching gor : "+item);
		int resultsCount = item.length();
		return resultsCount;
	}
}
