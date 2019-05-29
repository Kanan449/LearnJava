package day34_methods06;

import java.util.Arrays;

public class MainArray {
public static void main(String[] args) {
	CountArray.getArray();
	System.out.println(Arrays.toString(CountArray.getArray()));
	int [] nums = CountArray.getArray();
	System.out.println(Arrays.toString(nums));
	for(int nims: nums) {
		System.out.print(nims+" ");
	}
	System.out.println();
	//for(;;) {
	System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
	//}
	int [] randomNums = CountArray.getRandomArray(3);
	
	System.out.println(Arrays.toString(randomNums));
	
	
}
}
