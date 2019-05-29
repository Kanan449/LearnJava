package replHomeWorkProblems;

import java.util.*;

public class MethodsWithArrayList_187 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("race car"));
	}
	
	
	

	public static ArrayList<String> n1(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> n1 = new ArrayList<>();
		n1.addAll(wordList1);
		n1.addAll(wordList2);
		// create your method below

		return n1;
	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		for (String n1 : wordList) {
			if (n1.equalsIgnoreCase(targetWord)) {
				wordList.remove(n1);
			}
		}
	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num) {
		int sum = 0;
		for (int n2 : num) {
			if (n2 > 0) {
				sum += n2;
			}
		}
		num.add(sum);
		return num;
	}
	 public static boolean isPalindrome(String check) {
		    String nCheck = check.replace(" ","");
		    String mCheck = "";
		    for(int i = nCheck.length()-1; i>=0; i--){
		      mCheck+=nCheck.charAt(i);
		    }
		    boolean checked;
		    if(nCheck.equalsIgnoreCase(mCheck)){
		      checked=true;
		    }else{
		      checked=false;
		    }
		    return checked;
		  }
}