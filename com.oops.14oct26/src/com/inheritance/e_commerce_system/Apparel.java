package com.inheritance.e_commerce_system;

//6. Apparel Class (Extends PhysicalProduct)
class Apparel extends PhysicalProduct {
 protected String size;
 protected String material;

 public Apparel(String id, String name, double price, double weight, double shippingCost, String size, String material) 
 {
     super(id, name, price, weight, shippingCost);
     this.size = size;
     this.material = material;
 }

 public void tryOn() {
     System.out.println("Checking fit for Size: " + size + " (" + material + " material).");
 }
}