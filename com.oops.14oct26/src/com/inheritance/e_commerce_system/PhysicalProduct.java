package com.inheritance.e_commerce_system;

//2. Physical Product Class
class PhysicalProduct extends Product {
 protected double weight; // In kgs
 protected double shippingCost;

 public PhysicalProduct(String id, String name, double price, double weight, double shippingCost) {
     super(id, name, price); // Calling Product constructor
     this.weight = weight;
     this.shippingCost = shippingCost;
 }

 public double calculateTotalCost() {
     return price + shippingCost;
 }

 public void shipProduct() {
     System.out.println("Shipping " + name + " (Weight: " + weight + "kg) to customer address.");
 }
}