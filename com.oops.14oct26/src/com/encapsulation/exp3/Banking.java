package com.encapsulation.exp3;

public class Banking {
	
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private double amount;

	// Step 2: Constructor
	public Banking (String accountHolderName, String accountNumber, double balance, double amount) {

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Step 3: Getter methods to read data
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getamount() {
		return amount;
	}
	
	
	public funTransfer( )
	{
		
	}

}
