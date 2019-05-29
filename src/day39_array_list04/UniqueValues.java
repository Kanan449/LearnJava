package day39_array_list04;
import java.util.*;
public class UniqueValues {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	List<Integer> nums = new ArrayList<>();
	nums.add(10);
	nums.add(10);
	nums.add(7);
	nums.add(8);
	nums.add(8);
	nums.add(3);
	nums.add(4);
	nums.add(8);
System.out.println(nums);
System.out.println();

List<Integer> nNums = new ArrayList<>();
for(int n:nums) {
	if(!(nNums.contains(n))) {
		nNums.add(n);
	}
}
System.out.println(nNums.toString());


System.out.println();
List<Integer>nums1= new ArrayList<>();
for(int i = 0; i<nums.size(); i++) {
	int counter = 0;
	for(int k = 0; k<nums.size(); k++) {
		if(nums.get(i)==nums.get(k)&& i!=k) {
			counter++;
			break;
		}
	}
	if(counter==0) {
		nums1.add(nums.get(i));
	}
}
System.out.println(nums1.toString());
}
}
