package banking;

/**
* This is a SavingsAccount class.
*/
public class SavingsAccount {

	private double amount;
	
	private int allowedNumberOfEvents;
	private double interestReturn;
	
	
	public void deposit(double amount) {
		if (allowedNumberOfEvents == 0) {
			System.out.println("Limit is exceeded. Can't deposit");
			return;
		}
		
		this.amount = this.amount + amount;
		System.out.println("Your updated balance is: " + this.amount);
		
		allowedNumberOfEvents --;
		
		if (allowedNumberOfEvents == 0) {
			System.out.println("You have reached your limit of transactions.");
		}
	}
	
	public double withdraw(double amount) {
		if (allowedNumberOfEvents == 0) {
			System.out.println("Limit is exceeded. Can't withdraw");
			return 0.0;
		}
		
		if (this.amount >= amount) {
			this.amount = this.amount - amount;
			return amount;
		} else {
			double howMuchCanBeGiven = this.amount;
			
			System.out.println("We can't give you all the money you asked for.");
			System.out.println("Instead you're getting everything left in your account.");
			this.amount = 0;
			
			allowedNumberOfEvents--;
			if (allowedNumberOfEvents == 0) {
				System.out.println("You have reached your limit of transactions.");
			}
			
			return howMuchCanBeGiven;
		}
		
	}
	
	public double accumulateInterest() {
		
		return 0.0;
	}
}
