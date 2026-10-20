package com.inheritance.e_commerce_system;

//5. Laptop Class (Extends Electronics)
class Laptop extends Electronics {
 private String processor;

 public Laptop(String id, String name, double price, double weight, double shippingCost, int warrantyMonths, String processor) {
     super(id, name, price, weight, shippingCost, warrantyMonths);
     this.processor = processor;
 }

 public void compileCode() {
     System.out.println("Compiling Java code on " + processor + " processor...");
 }
}