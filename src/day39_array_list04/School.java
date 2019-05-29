package day39_array_list04;

public class School {
public static void main(String[] args) {
	//create object from a student class
	Student student = new Student();
	student.name = "Roman";
	student.age = 25;
	student.subject = "Java";
	
	
	System.out.println("Name: "+student.name);
	System.out.println("Age: "+student.age);
	System.out.println("Subject: "+student.subject);
	
	Student student2 = new Student();
	System.out.println(student2.name);
	
	
	student2.name= "Cleetus";
	student2.age= 23;
	student2.subject = "Moron";
	
	System.out.println("Name is: "+student.name);
	System.out.println("Age is: "+ student.age);
	System.out.println("Subject is: "+student.subject);
}
}
