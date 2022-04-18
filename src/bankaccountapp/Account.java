package bankaccountapp;

public abstract class Account implements IBaseRate {

	// List common properties for savings and checking accounts
	String name;
	String ssn;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;

	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {

		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		
		
		
		// Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
	}
	
	private String setAccountNumber() { 
		
		String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber =(int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}

	// List common methods
	public void showInfo() {
		
		System.out.println(
				
				"Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: $" + balance
				
				);
		
	}
	
}
