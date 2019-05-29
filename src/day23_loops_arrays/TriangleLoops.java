package day23_loops_arrays;

public class TriangleLoops {
public static void main(String[] args) {
	for (int j =0; j<=10; j++) {
		for (int i = 10; j<=i; i--) {
			System.out.print(i+" ");
			if(i<0) {
				break;
			}
		}
		
		System.out.println();
	}
	
	
}
}
