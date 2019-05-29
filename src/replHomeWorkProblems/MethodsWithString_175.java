package replHomeWorkProblems;

import java.util.List;
import java.util.*;

public class MethodsWithString_175 {
	public static String lameDb(String db, String op, String id, String data) {
		String[] arr = db.split("#");
		List<String> newArr = new ArrayList<>();
		int idx = Integer.parseInt(id)-1;
		for (int i = 0; i < arr.length; i++) {
			newArr.add(arr[i]);
		}
			if (op.equalsIgnoreCase("add")) {
				newArr.add(id + data);
			} else if (op.equalsIgnoreCase("edit")) {
				newArr.set(idx, id + data);
			} else if (op.equalsIgnoreCase("delete")) {
				newArr.remove(idx);
			} else {

			}
			
		
		String newdata = "";
		for(String ivx:newArr) {
			newdata+=ivx+"#";
		}
        newdata= newdata.substring(0,newdata.length()-1);
		return newdata;

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}