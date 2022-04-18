package bankaccountapp;

public class Checking extends Account {
	
	// List properties specific to a checking account 
	int debitCardNumber;
	int debitCardPin;

	// Constructor to initialized checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
		
	}
	
	
	// List any methods specific to the checking account 
	
	private void setDebitCard() {
		
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		
	}
	
	public void showInfo() {
		super.showInfo();
		
		System.out.println("Account Type: Checking ");
		
	}


}
