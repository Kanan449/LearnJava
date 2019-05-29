package day30_methods02;

public class StudentAtSchool {
	public static void main(String[] args) {
		
		study("HTML");
		sleep(10);
	}
	
	public static void study(String topic) {
		System.out.println("Student is studying "+ topic+".");
	}
	
	public static void sleep(int hours) {
		System.out.println("Student is sleeping for "+hours+" hours!");
	}
	
	
}
