package replHomeWorkProblems;

public class MethodOverLoading_176 {
	public static void main(String[] args) {
		int[] doIt = {2, 4, 7, 4, 3};
		
		findMax(doIt);
		
	}

	public static int findMax(int[] arr) {
		int k = 0;
		for (int n : arr) {
			if (n > k) {
				k = n;
			}
		}
		return k;
	}
	public static double findMax(double [] arr){
	    double j = 0.0;
	    for(double g: arr){
	      if(g>j){
	        j=g;
	      }
	    }
	    return j;
	  }
}
