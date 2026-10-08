package com.core_java_7oct26_StringPool;

public class Driver1 {
	
		public static void main(String[] args) {
			String s = "kodelwala"; //scp
			//in case i want to change s
			
			s.concat("academy");// but no one reffered it (every objects shoul has refference)
								// object created iin heap 
			
			System.out.println(s);
			
			String s2 = s.concat("academy"); // here  reffered it (every objects shoul has refference)
			 			
			System.out.println(s2);// here  reffered it (every objects shoul has refference)
								// object created iin heap 
			
			
		}

}
