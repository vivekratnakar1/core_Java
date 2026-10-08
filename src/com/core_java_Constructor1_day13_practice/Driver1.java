package com.core_java_Constructor1_day13_practice;

public class Driver1 {
	
	public static void main(String[] args) {

		Order o = new Order("Buy-Mobile", "Type:Electronics", 584510);
		
		System.out.println("name :" +o.name);
		System.out.println("type :" + o.type);
		System.out.println("amount:" + o.amount);
		System.out.println("============================");

			
		Order o1 = new Order("Buy-Laptop", "Type:Lapi + Gamer", 854700);
		
		System.out.println("name is  = " +o1.name);
		System.out.println("type is = " + o1.type);
		System.out.println("amount is =" + o1.amount);
		System.out.println("============================");
		
		Order o2 = new Order();
		
		System.out.println("Default name is  = " +o2.name);
		System.out.println("Default type is = " + o2.type);
		System.out.println("Default amount is =" + o2.amount);
	
		
	} 

}
