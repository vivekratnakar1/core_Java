package com.core_java_Constructor1_day13;

public class SignUp {

		public static void main(String[] args) {
			
			Electronic w = new Electronic ("iphone", "digital", 180000, 2);
			
			System.out.println("name:" + w.name);
			System.out.println("type:" + w.type);
			System.out.println("amount:" + w.amount);
			System.out.println("warrenty:" + w.warrenty);
			
			
		}
		
}
