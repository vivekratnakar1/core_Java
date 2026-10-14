package com.encapsulation.fundXfer;

public class Payment {
	
		private String	name;
		private long 	accountNumber;
		private int 	balance;
		private double	amount;
		
		
		
		public Payment(String name, long accountNumber, int balance, double amount)
		{
			this.name = name;
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.amount = amount;
			
		}
		
		
		public void doCredit(int amount)
		{
			balance = balance + amount;
		}
		
		public void doDebit (int amount)
		{if(amount >0) 
		    {
			balance = balance - amount;
		    }  
		}
		
		
		
}
