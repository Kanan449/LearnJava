package day45_encapsulation_review;

public class EtsyDotCom {
	public static void main(String[] args) {
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mtmail.info");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");

		System.out.println(acct1.toString());

		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("helirevaroyalhost.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("ab123");

		System.out.println(acct2.toString());

		EtsyAccount acct3 = new EtsyAccount("helireva@royalhost.info", "Helireva", "royal234");
		System.out.println(acct3.toString());

	}
}
