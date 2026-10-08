package com.core_java_Constructor1_day12;

public class Driver {
	
	public static void main(String[] args) {
		
			Sale sale = new Sale("OfferLater", "Kodewala", 150000, 1);
			System.out.println( "Status of Interview : " + sale.itemName);
			System.out.println( "Previous Company :" + sale.storeName);
			System.out.println( "Currentr_LPA :" + sale.price);
			System.out.println( "Current job offer you have is :" + sale.quantity);
			System.out.println( "================================");
			
			
			
			
			Sale sale1 = new Sale("OfferLater_1", 180000);
			System.out.println("2nd Offer Latter is :" + sale1.itemName);
			System.out.println( "Currentr_LPA :" + sale1.price);
			System.out.println( "================================");
			
			
			Sale sale2 = new Sale();
			System.out.println();
			
	}
	

}
