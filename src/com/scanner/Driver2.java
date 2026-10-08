package com.scanner;

import java.util.Scanner;

public class Driver2 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int luckyNumber = 11;
			int userinput = 0;
			
			while(userinput != luckyNumber)
			{
				System.out.println("Please Enter Correct Number");
				userinput = sc.nextInt();
				
			}if(userinput == luckyNumber)
			{
				System.out.println("You wonnnnn buddy !!! Hurrey");
			}
			
			/*
			 * else { System.out.println("Try Agin and Again and Again broowh!"); }
			 */
		}

}
