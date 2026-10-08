package com.core_java_Constructor_day12;

public class Driver {
	
		public static void main(String[] args) {
			
			Store store = new Store("Laptop", 52400, "Asus Gen12th", 2);
			
			System.out.println("Product name : "+ store.productName);
			System.out.println ("Product Price :" + store.price);
			System.out.println ("Prodcut Description :" + store.description);
			System.out.println ("Product Quantity : " + store.quantity);
			System.out.println("====================");
			
			Store store1 = new Store("i phone", "i phone 17");		
			System.out.println("Product name : "+ store1.productName);
			System.out.println("Prodcut Description :" + store1.description);
			System.out.println("====================");
						
			Store store3 = new Store();
			System.out.println();
		
		}

}
