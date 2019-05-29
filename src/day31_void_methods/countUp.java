package day31_void_methods;

public class countUp {
	public static void main(String[] args) {

		countUp(5);
		System.out.println();
		countDown(10);
		System.out.println();
		drive("Audi",100);
	}

	public static void countUp(int n) {
		int i = 1;

		if (n < 0) {
			System.out.println("Invalid input");
		} else {
			while (i < n + 1) {
				System.out.print(i + " ");
				i++;
			}
		}
	}

	public static void countDown(int k) {
		if (k < 0) {
			System.out.println("Invalid input");
		} else {
			while (k > 0) {
				System.out.print(k + " ");
				k--;
			}
		}
	}

	public static void drive(String car, int speed) {
		System.out.println(car+" is driving "+speed+" MPH");
	}

}