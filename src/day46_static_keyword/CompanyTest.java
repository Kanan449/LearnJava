package day46_static_keyword;

public class CompanyTest {
public static void main(String[] args) {
	System.out.println(Company.cname);
	
	Company c1 = new Company();
	System.out.println(c1.cname.toUpperCase());
}
}
