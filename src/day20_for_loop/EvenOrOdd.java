package day20_for_loop;

public class EvenOrOdd {
public static void main(String[] args) {
	
	for (int n = 1; n<= 100; n++) {
		if (n % 2 ==0 ) {
			System.out.print(n+" ");
		}
	}
	
	System.out.println();
	
	for (int j = 1 ; j<=100; j++) {
		if (j% 2 != 0 ) {
			System.out.print(j+" ");
		}
	}
	
	System.out.println();
	int sumOfEvenNumbers = 0;
	int sumOfOddNumbers = 0;
	for (int num = 0; num<=100; num++) {
		if (num%2==0) {
			sumOfEvenNumbers +=num;
		}
		else {sumOfOddNumbers += num;
	}
    
	}
	
	System.out.println(sumOfEvenNumbers);
	System.out.println(sumOfOddNumbers);
	
	
	
	
	
}
}