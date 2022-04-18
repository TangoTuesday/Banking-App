package bankaccountapp;

public class Savings extends Account {
	
	// List properties specific to the Savings Account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	
	public Savings (String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		
		accountNumber = "1" + accountNumber;
		setSafteyDepositBox();
		
	}
	
	private void setSafteyDepositBox() {
		
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
	}
	
	
	
	// List any methods specific to Savings Account 
	public void showInfo() {
			
		super.showInfo();
		
		System.out.println(
				
				" Your Savings Account Features: " + 
				"\n Saftey Deposit Box ID: " + safetyDepositBoxID +
				"\n Satey Deposit Box Key: " + safetyDepositBoxKey
				
				);
		
		}

}
