package day13_ternary_strings_intro;

public class MoreTernary {
public static void main(String[] args) {
	String quality = "good;";
	int rating = (quality.equals("good")) ? 100:0;
	
	System.out.println("Rating: "+rating);
	
	
	int pmHour = 1;
	
	boolean rushHour = (pmHour>=4 && pmHour<=7) ? true: false;
	
	
	
	System.out.println(rushHour);
	
	String result = (rushHour==true) ? "yes" : "no";
	
	System.out.println(result);
	
	int amHour =8;
	
	String amRushHour = (amHour>6 && amHour<9) ? "yes":"no";
	System.out.println(amRushHour);
	
	
	
	
	
	
}
}
