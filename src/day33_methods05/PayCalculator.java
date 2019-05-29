package day33_methods05;

public class PayCalculator {
	public static void main(String[] args) {
		getHourlyPay(5,25);
		System.out.println("This weeks paycheck amounts to: "+getHourlyPay(0,23));
	}
	
	
	
	
	
	
	
	

	public static int getHourlyPay(int hours, int rate) {
		if(hours<=0) {
			System.out.println("Invalid hours");
			return 0;
		}else if(rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}else {
		int totalPay = hours * rate;
		System.out.println(totalPay);
		return totalPay;
		
	}

}
}