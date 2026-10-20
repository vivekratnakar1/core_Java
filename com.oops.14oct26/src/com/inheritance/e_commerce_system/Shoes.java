package com.inheritance.e_commerce_system;

//8. Shoes Class (Extends Apparel)
class Shoes extends Apparel {
 private String soleType;

 public Shoes(String id, String name, double price, double weight, double shippingCost, String size, String material, String soleType) {
     super(id, name, price, weight, shippingCost, size, material);
     this.soleType = soleType;
 }

 public void tieLaces() {
     System.out.println("Tying laces of " + name + " featuring comfort " + soleType + " sole.");
 }
}