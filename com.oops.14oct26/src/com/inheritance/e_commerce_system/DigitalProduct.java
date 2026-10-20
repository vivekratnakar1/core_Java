package com.inheritance.e_commerce_system;

//9. Digital Product Class
class DigitalProduct extends Product {
 protected String downloadUrl;

 public DigitalProduct(String id, String name, double price, String downloadUrl) {
     super(id, name, price);
     this.downloadUrl = downloadUrl;
 }

 public void deliverViaEmail() {
     System.out.println("Sending download link for " + name + " to registered email.");
     System.out.println("Download Link: " + downloadUrl);
 }
}
