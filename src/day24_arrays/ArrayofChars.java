package day24_arrays;

public class ArrayofChars {
public static void main(String[] args) {
	
	char[] values = {'a','b','c'};
	for(char value: values) {
		System.out.println(value);
	}

	String str = "Wooden spoon";
	
	char[] chars = str.toCharArray();
	for (char c: chars) {
		System.out.print(c+"_");
	}
	System.out.println();
	for(int i = chars.length-1; i >= 0; i--) {
		System.out.print(chars[i]+"_");
		str+=chars[i];
	}
	System.out.println();
	
	System.out.println(str);
	
	
	for(char c: chars) {
		if(c == 'o') {
			System.out.print("*");
		}
		else {
			System.out.print(c);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
