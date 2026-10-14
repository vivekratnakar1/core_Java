package com.encapsulation.exp1;


public class Main {
    public static void main(String[] args)
    {
        FundTransfer MehulAccount = new FundTransfer("MEHUL", "12345", 5500.0);
        FundTransfer ReyanshAccount = new FundTransfer("REYANSH", "67890", 200.0);

        // Set the transfer amount using the encapsulated setter
        MehulAccount.setAmount(150.0); 
        
        // Execute transfer using the stored transaction amount
        MehulAccount.transferFund(ReyanshAccount);

        // Display final balances
        System.out.println("Mehul's Final Balance: " + MehulAccount.getBalance());
        System.out.println("Reyansh's Final Balance: " + ReyanshAccount.getBalance());
    }
}
