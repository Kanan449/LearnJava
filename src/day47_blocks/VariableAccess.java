package day47_blocks;

public class VariableAccess {
	//instance variable
	int  myInstanceVar = 40;
	
	
	//static variable
	static int myStaticVar= 55;
	
	
	
	
	
public static void main(String[] args) {
	//System.out.println(myInstanceVar);... static method can not access non static variable;
	System.out.println(myStaticVar);
	
	//create object of variable class and print myInstanceVar
	VariableAccess v = new VariableAccess();
	System.out.println(v.myInstanceVar);
	
	//access static variable using objects
	System.out.println(v.myStaticVar);
	
}
}
