package day40_customclasses_methods;

public class NewEmployee {
public static void main(String[] args) {
	Employee kanan = new Employee();
	kanan.jobTitle = "Qa Tester";
	kanan.name = "Kanan";
	kanan.salary = "135K";
	
	kanan.introduce();
	kanan.work();
	kanan.attendMeeting();
}
}
