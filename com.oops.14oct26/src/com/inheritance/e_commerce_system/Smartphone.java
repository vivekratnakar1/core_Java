package com.inheritance.e_commerce_system;

//4. Smartphone Class (Extends Electronics)
class Smartphone extends Electronics {
 private int ramGB;

 public Smartphone(String id, String name, double price, double weight, double shippingCost, int warrantyMonths, int ramGB) {
     super(id, name, price, weight, shippingCost, warrantyMonths);
     this.ramGB = ramGB;
 }

 public void bootOS() {
     System.out.println("Smartphone " + name + " with " + ramGB + "GB RAM is booting up...");
 }

 public void displayBasicDetails() {
	// TODO Auto-generated method stub
	
 }

 public void displayBasicDetails1() {
	// TODO Auto-generated method stub
	
 }
}