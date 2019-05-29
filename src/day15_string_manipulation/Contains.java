package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
        System.out.println(email.contains("@"));
        
        String list = "potatoes, apples, tomatoes, eggs, milk, cereal, meat,avocados";
        
        boolean check = list.contains("apples");
        if (check) {
        System.out.println("Apples are there");
        }else { System.out.println("Let's add apples now");
        }
        
        
        if(list.contains("apples")) {
        	System.out.println("Apples are there");
        }else { 
        	System.out.println("Lets add apples now");
        }
        
        boolean hasEggs = list.contains("eggs");
        if (hasEggs) {
        	System.out.println("Contains eggs");
        }
        
        boolean hasCucumbers = list.contains("cucumbers");
        System.out.println("List contains cucumbers");
        
        email= "name@yahoo.com";
        
if(email.contains("yahoo")) {
	System.out.println("It is yahoo email");
}else if(email.contains("gmail")) {
	System.out.println("It is gmail email.");
}else if(email.contains("hotmail")) {
	System.out.println("It is hotmail account");
}

String etsyTitle = "Wooden spoon | Etsy";
if(etsyTitle.contains(" | ")) {
	System.out.println("Pipe is there as expected");
}else {
	System.out.println("Pipe is not detected");
}
        
String name ="Kanan";
if (name.contains("a") || name.contains("e")) {
	System.out.println("Letter \"a\" or \"e\" is there.");
}else {
	System.out.println("Name does not contain a and e.");
}

if (hasCucumbers) {
	System.out.println("List contains cucumbers");
}else {
	System.out.println("List does not contain cucumbers");
}

        
        
        
	}

}
