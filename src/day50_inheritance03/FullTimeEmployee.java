package day50_inheritance03;

public class FullTimeEmployee extends Employee{
public void calculatePay(int hours, double rate) {
	double total = (hours *rate)*1.05;
	System.out.println("Fulltime employee total pay: "+total);
	
}
}
