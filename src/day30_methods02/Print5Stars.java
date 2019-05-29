package day30_methods02;

public class Print5Stars {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i<101; i++) {
		 
			System.out.print(count+":");print5Stars();
			count++;
		}
	}



public static void print5Stars() {
	System.out.println("* * * * *");
}
}