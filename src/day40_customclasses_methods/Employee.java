package day40_customclasses_methods;

public class Employee {
public String name;
public String jobTitle;
public String salary;

public void work() {
	System.out.println(name+" is working");
}

public void attendMeeting() {
	System.out.println(name+" attending meeting");
}

public void introduce() {
	System.out.println("Name: "+name+" | Job title: "+jobTitle+" | Salary: "+salary);
}


}
