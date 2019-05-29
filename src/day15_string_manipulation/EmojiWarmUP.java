package day15_string_manipulation;

public class EmojiWarmUP {
	public static void main(String[] args) {
		String emoji = ":)";
		
		if (emoji.length()!=2) {
			System.out.println("Invalid Emoji");
			return;
		}
		char first =emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first ==':') {
		   if(second==')') { 
			   System.out.println("Smile");
		   }else if (second=='(') {
			   System.out.println("Sad");
		   }else if  (second =='/') {
			   System.out.println("Upset");
		   }else if (second=='p') {
			   System.out.println("playful");
		   }
		}else if (first ==';') {
			if(second==')') {
				System.out.println("wink");
		   }else if(second==0) {
			   System.out.println("surprised");
		   }else { 
			   System.out.println("Unknown emoji");
		   }
			
		}else if (first =='(') {
			if (second==':') {
				System.out.println("Sad");
			}
			
		}else if (first ==')') {
			
		}else {
			System.out.println("Invalid emoji");
		}
	}

}
