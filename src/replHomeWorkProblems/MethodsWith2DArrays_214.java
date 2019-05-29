package replHomeWorkProblems;

//import com.sun.tools.javac.Main;

public class MethodsWith2DArrays_214 {
	public static double convertC(String[][] money, String[][] convertionRate) {
		double[] newCur = new double[money.length];
		for (int i = 0; i < money.length; i++) {
			newCur[i] = Double.parseDouble(money[i][1]);
		}

		double[] conRate = new double[convertionRate.length];
		for (int i = 0; i < convertionRate.length; i++) {
			conRate[i] = Double.parseDouble(convertionRate[i][1]);
		}

		double finalAmount = 0;

		 for(int i = 0; i < newCur.length; i++){
		 finalAmount+= newCur[i]*conRate[i];
		 }

		return finalAmount;

	}

	public static void main(String[] args) {

		String[][] test_money = { { "mark", "5" }, { "shekel", "30.5" }, };

		String[][] test_convert = { { "mark", "1" }, { "shekel", "0.5" }, };

		double res = convertC(test_money, test_convert);
		System.out.print(res);

		
		String n1 = "kanan";
		Character.isLetter(n1.charAt(0));
		n1.replaceFirst("k","l");
	
	}
	
}
