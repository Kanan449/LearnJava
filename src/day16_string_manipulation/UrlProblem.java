package day16_string_manipulation;

import java.util.Scanner;

public class UrlProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter URL:");
	    String url= scan.next();
		
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid URL format");
			return;
		}
		
        //int lastDot= url.lastIndexOf('.');	
		
		int dotIndex = url.length() - 4;
		
		if(url.charAt(dotIndex)=='.') {
			System.out.println(". is present before extension");
		}else {
			System.out.println(". might be misplaced");
		}
		
		String domain= url.substring(4, dotIndex);
		
		System.out.println(domain);
        
		String extension= url.substring(dotIndex+1, url.length());
		
		System.out.println(extension);
	}
}
