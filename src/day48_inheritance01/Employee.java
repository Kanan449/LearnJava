package day48_inheritance01;
//employee IS-A person, Parent class Person, child class is Employee
public class Employee extends Person {
String jobTitle;

public void work() {
	System.out.println(name+" is working as a "+jobTitle);
}

@Override
public String toString() {
	return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}


}
