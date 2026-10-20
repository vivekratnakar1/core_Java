package com.inheritance.e_commerce_system;

//7. TShirt Class (Extends Apparel)
class TShirt extends Apparel {
 private String graphicDesign;

 public TShirt(String id, String name, double price, double weight, double shippingCost, String size, String material, String graphicDesign) {
     super(id, name, price, weight, shippingCost, size, material);
     this.graphicDesign = graphicDesign;
 }

 public void displayDesign() {
     System.out.println("TShirt features a cool '" + graphicDesign + "' print on the front.");
 }

 public void displayBasicDetails() {
	// TODO Auto-generated method stub
	
 }
}
