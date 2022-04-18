package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "123456758", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "345675485", 2500);
		
		savacc1.showInfo();
		
		System.out.println("****************");
		
		chkacc1.showInfo();
		
		
		// Read a CSV File then create new accounts based on that data 
		
		
		
	}
	
}
