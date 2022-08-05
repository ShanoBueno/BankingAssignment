package BankingAssingmentPackage;

public class Account {
	

	int balance; 
	
	int withdraw(int wamount) {
		balance = balance - wamount; 
		return balance; 
	}
	
	int deposit(int damount) {
		balance = balance + damount; 
		return balance; 
	}
	
	
	public static class SavingsAccount extends Account {
		
		double ROI; 
		
		double CalculateInterest(double ROI, int year) {
			double interest = ROI * year; 
			return interest; 
		}		
	}
	
	public static class CheckingAccount extends Account {
		int overDraft; 
		
	}
	
	public static void main(String[] args) {
		SavingsAccount saving1 = new SavingsAccount(); 
		saving1.balance = 100; 
		saving1.ROI = 0.5; 
		System.out.println("The balance for savings1 before the deposit is: " + saving1.balance);
		saving1.deposit(300);
		System.out.println("The balance for savings1 after the deposit is: " + saving1.balance);
		saving1.withdraw(50);
		System.out.println("The balance for savings1 after the withdrawal is: " + saving1.balance);

		saving1.CalculateInterest(saving1.ROI, 3); 
		System.out.println("The ROI for savings1 after is: " + saving1.CalculateInterest(saving1.ROI, 3)); 


		
		CheckingAccount check1 = new CheckingAccount(); 
		check1.balance = 20000; 
		System.out.println("The balance for check1 before withdrawal is: " + check1.balance);
		check1.withdraw(4500);
		System.out.println("The balance for check1 after withdrawal is: " + check1.balance);

		check1.deposit(1000);
		System.out.println("The balance for check1 after desposit is: " + check1.balance);
		check1.overDraft = 500; 
		System.out.println("The overdraft for check1 is: " + check1.overDraft);
	
	}

}
