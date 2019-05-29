package replHomeWorkProblems;
import java.util.Scanner;
public class OnlineBookMerchants080 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int freeBooks = 0;
	boolean isPremiumCustomer = scan.nextBoolean();
	int nbooksPurchased = scan.nextInt();
	
	
	if(isPremiumCustomer) {
		if (nbooksPurchased>=5 && nbooksPurchased<8) {
			++freeBooks;
		}
		else if (nbooksPurchased>=8) {
			freeBooks= freeBooks+2;
		}
	}
	else {
		if (nbooksPurchased>=7 && nbooksPurchased<12) {
			++freeBooks;
		}
		else if (nbooksPurchased>=12) {
			freeBooks= freeBooks+2;
        }
	}
	
	System.out.println(freeBooks);
	
	
	
	
	
	
	
	
	
	
	
}
}
