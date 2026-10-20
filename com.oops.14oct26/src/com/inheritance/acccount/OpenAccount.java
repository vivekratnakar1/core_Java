package com.inheritance.acccount;

// Inherits everything from the Account class
public class OpenAccount extends Account {

	// Child-specific method
	public void openAccount(String name, String address, String type) 
	{
		System.out.println("New OpenAccount Method -> Name: " + name + ", Address: " + address + ", Type: " + type);
		System.out.println("=====================================");
	}
}
