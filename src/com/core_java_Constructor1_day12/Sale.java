package com.core_java_Constructor1_day12; //23sept26

public class Sale {
	
	String itemName;
	String storeName;
	int price;
	int quantity;
	
	//Constructor with arguments
	Sale(String itemName, String storeName, int price, int quantity )
	{
		this.itemName = itemName;
		this.storeName = storeName;
		this.price = price;
		this.quantity = quantity;	
		System.out.println("Constructor with arguments:---");
		
	}	
	//Overloaded Constructor
	Sale(String itemName, int price)
	{
		this.itemName = itemName;
		this.price = price;
		System.out.println("Overloaded Contructor");
	}
	//Default Constructor
	Sale()
	{
		System.out.println("Default Contructor");
	}
}
