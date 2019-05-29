package day46_static_keyword;

public class Customer {
private String name;
private String email;
static int count;


public Customer() {
	// TODO Auto-generated constructor stub
	this.name="Undefined";
	this.email="Undefined";
	count++;
}
public Customer(String name, String email) {
	this.name = name;
	this.email = email;
	count++;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return email;
}


}

