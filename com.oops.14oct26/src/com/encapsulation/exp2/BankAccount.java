package com.encapsulation.exp2;

class BankAccount {

	// Step 1: Data hiding using private variables
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private double amount;

	// Step 2: Constructor
	public BankAccount(String accountHolderName, String accountNumber, double balance, double amount) {

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
	
	public double amount() {
		return amount;
	}

	// Step 4: Controlled fund transfer
	public void transfer(BankAccount receiver, double amount) {

		if (amount <= 0) {
			System.out.println("Amount must be positive.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			this.amount = amount;
			this.balance = this.balance - amount;
			receiver.balance = receiver.balance + amount;

			System.out.println("Transfer successful!");
		}
	}
}
