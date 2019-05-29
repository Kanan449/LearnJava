package day50_inheritance03;

public class AppsFactory {
public static void main(String[] args) {
	
	IPhoneApp iApp = new IPhoneApp();
	IPhoneApp iApp2 = new IPhoneApp("Uber");
	
	AndroidApp andrApp = new AndroidApp();
	AndroidApp andrApp2 = new AndroidApp("Lyft");
	
	System.out.println(iApp.getName());
	System.out.println(iApp2.getName());
	
	System.out.println(andrApp.getName());
	System.out.println(andrApp2.getName());
	
	App.count = 33;
	System.out.println(IPhoneApp.count);
	AndroidApp.count = 100;
	System.out.println(AndroidApp.count);
	System.out.println(IPhoneApp.count);
	
	App.build("Swift");
	IPhoneApp.build("Objective C");
	AndroidApp.build("Java");
	
	//Static variables are shared class variables, it will have single central value for all objects and subclasses.
	//Static methods can be called using "Parentclass.methodname" or "SubClassname.methodname".
	
	
	
}
}
