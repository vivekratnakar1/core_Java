package com.encapsulation.payment;
//oop.com.encapsulation.payment; // Ensure this matches your package structure

public class Payment {
    
    // Change String to int so you can do math operations
    public int balance; 

    // No-argument constructor
    public Payment() {
        super();
        this.balance = 1000; // Initialize default balance to 0
    }

    public void doDebit(int _amount) {
        balance = balance - _amount;
    }

    public void doCredit(int _amount) {
        if (_amount > 0) {
            balance = balance + _amount;
        }
    }
} // This brace now correctly closes the class at the very end

	

