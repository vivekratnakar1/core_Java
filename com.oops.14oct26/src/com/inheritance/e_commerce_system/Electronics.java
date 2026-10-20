package com.inheritance.e_commerce_system;

//3. Electronics Class (Extends PhysicalProduct)
class Electronics extends PhysicalProduct {
 protected int warrantyMonths;

 public Electronics(String id, String name, double price, double weight, double shippingCost, int warrantyMonths) {
     super(id, name, price, weight, shippingCost);
     this.warrantyMonths = warrantyMonths;
 }

 public void checkWarranty() {
     System.out.println("Warranty valid for: " + warrantyMonths + " months.");
 }
}