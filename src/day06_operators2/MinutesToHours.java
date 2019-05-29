package day06_operators2;

public class MinutesToHours {
  public static void main(String[] args) {
	int minutes;
	minutes = 150;
	int hours = minutes / 60;
	int remainingMinutes = minutes % 60;
	
	System.out.println(hours);
	System.out.println(remainingMinutes);
	System.out.println(hours +" hours and "+remainingMinutes+ " minutes" );
	System.out.println(minutes > remainingMinutes);
}

}
