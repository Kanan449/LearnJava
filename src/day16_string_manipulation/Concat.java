package day16_string_manipulation;

public class Concat {
public static void main(String[] args) {
	String word = "java";
	
	System.out.println(word.concat("+selenium"));
	System.out.println(word.concat(" selenium"));
			
    //word= word.concat(123);
	
	//.concat method takes only string
	//+ operator will take anything
	word= word + 123;
	System.out.println(word);
	
	
	String word2 = "Hi";
	word2= word2.concat(" hey").concat(" how are you").concat(" good");
	System.out.println(word2);
	
	
			
			
			
			
}
}
