package com.inheritance.acccount;

public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        OpenAccount myAccount = new OpenAccount();
        
        // 1. Call the method from the parent class (Account)
        myAccount.openBankAccount("Lalit", "0012548 Btm 1st", "Savings");
        
        
        // 2. Call the method from the child class (OpenAccount)
        myAccount.openAccount("Maya", "004989656 btm 2nd", "current");
        
        
        myAccount.openAccount("Rohan", "005188854 btm 2nd", "joint");
        
        myAccount.openAccount("Maya", "025665656 btm 2nd", "chiled");
    }
}
