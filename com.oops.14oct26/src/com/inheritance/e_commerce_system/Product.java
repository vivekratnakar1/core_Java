package com.inheritance.e_commerce_system;
//1. Main Parent Class


class Product {
 protected String id;
 protected String name;
 protected double price;

 public Product(String id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 public void displayBasicDetails() {
     System.out.println("Product ID: " + id + " | Name: " + name + " | Base Price: ₹" + price);
 }
}