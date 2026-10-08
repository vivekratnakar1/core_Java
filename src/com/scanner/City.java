package com.scanner;

public class City {
	
	public static void main(String[] args) {
		
	
	String[] cities = {
		    "Mumbai",
		    "Delhi",
		    "Bengaluru",
		    "Hyderabad",
		    "Chennai",
		    "Kolkata",
		    "Pune",
		    "Ahmedabad",
		    "Jaipur",
		    "Lucknow",
		    "Chandigarh",
		    "Bhopal",
		    "Indore",
		    "Nagpur",
		    "Raipur",
		    "Patna",
		    "Surat",
		    "Ranchi",
		    "Bhubaneswar",
		    "Dehradun"
		};
	
	for (int index = 0; index < cities.length; index++) 
	{
	    String currentcities = cities[index];
	    if (currentcities.equals("Dehradun")) 
	    {
	        System.out.println("I live there ");
	    }
		}
	}
}
