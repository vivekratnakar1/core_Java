package com.encapsulation.exp1;


public class FundTransfer {

	// All attributes are private to protect data from direct modification.

	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private double amount; 

	// Constructor to initialize the account
	public FundTransfer(String accountHolderName, String accountNumber, double initialBalance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		
		
		// Ensure starting balance is positive
		if (initialBalance >= 0)
		{
			this.balance = initialBalance;
		} else 
		{
			this.balance = 0;
		}
		this.amount = 0.0; // Initialize transaction amount to 0
	}
	
	// LOGIC METHODS (Requirement 1, 4, & 5)
	/**
	 * Transfers funds to a destination account using the current 'amount'
	 * attribute.
	 */
	public void transferFund(FundTransfer destinationAccount) {
		// Requirement 4: Only positive amount transaction allowed
		if (this.amount <= 0) {
			System.out.println("Error: Transfer amount must be positive. Current amount set: " + this.amount);
			return;
		}

		// Requirement 5: Transaction amount should be less than or equal to current
		// balance
		if (this.amount > this.balance) {
			System.out.println(
					"Error: Insufficient funds. Available balance: " + this.balance + ", Attempted: " + this.amount);
			return;
		}

		// Complete the transfer by debiting this account and crediting the recipient
		this.balance -= this.amount;
		destinationAccount.deposit(this.amount);
		System.out.println(
				"Successfully transferred " + this.amount + " to " + destinationAccount.getAccountHolderName());
	}

	/**
	 * Helper method to receive money during a transfer.
	 */
	private void deposit(double amount)
	{
		if (amount > 0) {
			this.balance += amount;
		}
	}

	// GETTERS & SETTERS (Requirement 3 & 6)
	// Providing controlled access to private variables.
	// Getter and Setter for the new 'amount' attribute
	public double getAmount() {
		return this.amount;
	}

	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	// Requirement 3: Other classes should be able to read the balance
	public double getBalance()
	{
		return this.balance;
	}
	

	public String getAccountHolderName()
	{
		return this.accountHolderName;
	}
	

	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}

	
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
}
