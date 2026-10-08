package com.core_java_7oct26_StringPool;

public class Driver {	
	
		public static void main(String[] args) {
			//providing same string
			String city1 = "Kodewala1";
			String city2 = "Kodewala2";
			String city3 = "Kodewala1";
			String city4=  "Kodewala1";
			String city5 = "Kodewala3";
			String city6 = "Kodewala1";
			String city7 = "Kodewala1";
			
			//compaaring
		System.out.println(city1 == city2);  
		System.out.println(city1 == city3);
		System.out.println(city1 == city4);
		System.out.println(city1 == city5);
		System.out.println(city1 == city6);
		System.out.println(city1 == city7);
		
		}

}
