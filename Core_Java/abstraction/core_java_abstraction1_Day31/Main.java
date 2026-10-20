package com.core_java_abstraction1_Day31;

//Concrete implementation
class OnlineOrderService extends OrderProcessor 
{
	// Inherits placeOrder and keeps core operations completely hidden
}

//Main class representing an external system
public class Main 
{
	public static void main(String[] args)
	{
		OrderProcessor orderSystem = new OnlineOrderService();

		// Other classes can only interact with this single exposed method
		orderSystem.placeOrder("Laptop", 1);
	}
}