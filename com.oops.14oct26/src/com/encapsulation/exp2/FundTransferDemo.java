package com.encapsulation.exp2;

public class FundTransferDemo {

	public static void main(String[] args) {

		BankAccount sender = new BankAccount("Vivek", "101", 10000, 0);

		BankAccount receiver = new BankAccount("Rahul", "102", 5000, 0);

		System.out.println("Sender: " + sender.getAccountHolderName());

		System.out.println("Sender Balance: " + sender.getBalance());

		// Transfer Rs. 2000
		sender.transfer(receiver, 2000);

		System.out.println("Sender Balance After Transfer: " + sender.getBalance());

		System.out.println("Receiver Balance After Transfer: " + receiver.getBalance());
	}
}
