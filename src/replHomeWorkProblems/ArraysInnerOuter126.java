package replHomeWorkProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerOuter126 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			
			String outer1= Arrays.toString(outer);
			String inner1= Arrays.toString(inner);
//		    outer1 = outer1.replace("[", "").replace("]", "");
//			inner1 = inner1.replace("[", "").replace("]", "");
//			
			inner1= inner1.substring(1, inner1.length()-2);
			
			System.out.println(outer1.contains(inner1));
			
	  }
	}

