package day41_customclasses02;

public class BankAccount {
double balance;
String accountHolder;
int accountNumber;

public void deposit(Double amount) {
	System.out.println("Depositing "+amount+"$ to "+accountNumber);
	balance+=amount;
}
public void withdraw(Double amount) {
	System.out.println("withdrawing "+amount+"$ "+" from "+accountNumber);
	balance-=amount;
	if(balance<0) {
		balance=balance-35;
	}
}
public void showBalance() {
	System.out.println("===================");
	System.out.println("Account holder: "+accountHolder);
	System.out.println("Account number: "+accountNumber);
	System.out.println("Balance: "+balance);
	System.out.println("===================");
	}
public void charge(Double price, String item) {
	if(balance>price) {
	System.out.println("Buying "+item+", charging "+price+"$...");
	balance-=price;
	}else {
		System.out.println("Your balance is not enough to purchase "+item+".");
	}
}
}

