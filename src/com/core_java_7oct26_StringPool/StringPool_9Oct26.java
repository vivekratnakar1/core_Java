package com.core_java_7oct26_StringPool;



public class StringPool_9Oct26 {
	
		public static void main(String[] args) {
			
			String s1  = "Kodewala";  //String Constant Pool (SCP) 
			String s2 = "Academy";    //String Constant Pool (SCP) 
			
			String s3 = s1 + s2;
			
			System.out.println(s3);
			
			String s4 = "KodewalaAcademy";
			
			System.out.println(s4 == s3.intern()); //checking it is available in String Pool or Not
			System.out.println("=====================");
			
			String a1  = "Bangaluru";  //String Constant Pool (SCP) 
			String a2 = "city";    //String Constant Pool (SCP) 
			
			String a3 = a1 + a2;
			
			System.out.println(a3);
			
			String a4 = "KodewalaAcademy";
			
			System.out.println(a4 == a3.intern());
			
			
		}
		
		
		

}
