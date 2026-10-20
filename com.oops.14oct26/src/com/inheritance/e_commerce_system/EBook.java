package com.inheritance.e_commerce_system;

//10. EBook Class (Extends DigitalProduct)
class EBook extends DigitalProduct {
 private int pageCount;

 public EBook(String id, String name, double price, String downloadUrl, int pageCount) {
     super(id, name, price, downloadUrl);
     this.pageCount = pageCount;
 }

 public void openReader() {
     System.out.println("Opening EBook reader. Total Pages to read: " + pageCount);
 }

 public void displayBasicDetails() {
	// TODO Auto-generated method stub
	
 }

 public void deliverViaEmail() {
	// TODO Auto-generated method stub
	
 }
}