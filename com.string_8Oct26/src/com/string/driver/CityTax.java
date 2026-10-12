package com.string.driver;

class Raipurcity {
    // The base tax remains constant
    final int HOUSE_TAX = 4000; 
    int appliedTax = HOUSE_TAX; 

    public void discountCharges() { 
        // Only for senior citizens: update the applied tax, not the final constant
        this.appliedTax = 3000; 
    } 

    public final void NoCharges() { 
        this.appliedTax = 0;
    } 
}

public class CityTax extends Raipurcity { 
    public static void main(String[] args) { 
        Raipurcity r = new Raipurcity(); 
        
        System.out.println("Original Tax: " + r.appliedTax); 
        
        r.discountCharges(); 
        System.out.println("Tax After Discount: " + r.appliedTax); 
    } 
}
