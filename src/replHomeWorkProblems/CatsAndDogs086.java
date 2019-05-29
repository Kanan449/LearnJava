package replHomeWorkProblems;
import java.util.*;
public class CatsAndDogs086 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int countOfCats = 0;
    int countOfDogs = 0;
    boolean equalAnimals;
    String word = scan.next();
	
	while(word.contains("cat")||word.contains("dog")) {
		if (word.contains("cat")) { 
			word  = word.replaceFirst("cat", "");
			countOfCats++;
			}
		if (word.contains("dog")) {
			word = word.replaceFirst("dog","");
			countOfDogs++;
		}
	
	}
	
	//if (countOfCats==countOfDogs) {
	//	System.out.println("true");
	//}
	//else {
	//	System.out.println("false");
	//}
	
	System.out.println(countOfCats==countOfDogs);
}
}
