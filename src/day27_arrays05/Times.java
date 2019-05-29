package day27_arrays05;

public class Times {
	public static void main(String[] args) {
		
		int [] time1 = new int [2];
		int [] time2 = new int [2];
		
	//	System.out.println(time1[0]); ===0
		
		time1[0] = 10;
		time1[1] = 15;
		
		time2[0] = 16;
		time2[1] = 10;
		
		//Before comaparing, check if both arrays have valid hours
		
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hours");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid hours");
			return;
		}
		if(time2[0] < 0 || time2[0] > 23) {
				System.out.println("Time1 has invalid hours");
				return;
			}
			
		if(time2[1] < 0 || time2[1] > 59) {
				System.out.println("Time1 has invalid hours");
				return;
		}
		
		//Compare and tell which one is earlier
		//Compare hours
		
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}
		else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}
		else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}
			else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}
			else {
				System.out.println("Same time");
			}
			
		}
		
		
		
		
		
		
		
	}

}
