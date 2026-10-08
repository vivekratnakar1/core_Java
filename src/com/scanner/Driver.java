package com.scanner;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.println("plz enter price");
		
	if (sc.hasNextInt())
		{
			price = sc.nextInt();
		}else
		{
			System.out.println("Plz correct price here");
		}
		System.out.println("Price:" + price);
		
		sc.close();
	}
}
