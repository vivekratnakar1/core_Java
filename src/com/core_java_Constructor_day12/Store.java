package com.core_java_Constructor_day12;

public class Store {
	
		String 	productName;
		int 	price;
		String	description;
		int		quantity;
		
		  // Parameterized constructor
		Store(String productname, int price, String description, int quantity )
		{
			this.productName = 	productname;
			this.price	=		price;
			this.description =	description;
			this.quantity	=	quantity;
		
			System.out.println("Parameterized Constructor for name,price,description and quantity");
		}
		
		 // Overloaded constructor
		Store (String productname, String description)
		{
			this.productName = 	productname;
			this.description =	description;
		
			System.out.println("Only Product name and Description Constructor");
		}
		// Default constructor (no argument constructor)
		Store()
		{
			System.out.println("Default Constructor");
		}
}
