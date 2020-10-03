public class CreditCard{
	private String customer, bank, account;
	private int limit;
	private double balance;

	// Constuctors
	
	public CreditCard(String cust, String bank, String account, int limit, double initialBalance){
		// initialise with initial balance as 0
		this(cust, bank, account, limit, 0.0);
	}

	// Accessors
	
	public String getCustomer(){
		return customer;
	}

	public String getBank(){
		return bank;
	}

	public String getAccount(){
		return account;
	}

	public int getLimit(){
		return limit;
	}

	public double getBalance(){
		return balance;
	}

	//
	// update methods
	//
	
	public boolean charge (double price){
		if(price + balance > limit)
			return false;

		balance += price;
		return true;
	}
	
	public void makePayment(double amount){
		balance -= amount;
	}

	// print method for all information
	public static void printSummary(CreditCard card){
		System.out.println("Customer: " + card.customer);
		System.out.println("Bank: " + card.bank);
		System.out.println("Account Number: " + card.account);
		System.out.println("Balance: " + card.balance);
		System.out.println("Limit: "+ card.limit);
	}


	public static void main(String[ ] args) {
		CreditCard[ ] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings","5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bowman", "California Federal","3485 0399 3395 1954", 3500);
		wallet[2] = new CreditCard("John Bowman", "California Finance","5391 0375 9387 5309", 2500, 300);
		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
	}
	for (CreditCard card:wallet)
		CreditCard.printSummary(card);
		while (card.getBalance( ) > 200.0) {
			card.makePayment(200);
			System.out.println("New balance = " + card.getBalance( ));
		}
	}

}
