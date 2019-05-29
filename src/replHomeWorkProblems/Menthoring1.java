package replHomeWorkProblems;

public class Menthoring1 {
public static void main(String[] args) {
	
	int n = 3;
	int k = 5;
	
    n = n*k;
    k = n/k;
    n = n/k;
    
    System.out.println(isPalindrome(1001));
	
	
	System.out.println(n);
	System.out.println(k);
	
	
	
}


public static boolean isPalindrome(int k) {
	int palindrome  = k;
	int reversed = 0;
	while(palindrome!=0) {
		int remainder = palindrome%10;
		reversed = reversed * 10 + remainder;
		palindrome = palindrome / 10;
		}
	if(reversed==k) {
		return true;
	}else {
		return false;
	}
	
}
}
