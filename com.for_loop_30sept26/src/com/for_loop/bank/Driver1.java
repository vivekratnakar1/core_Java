package com.for_loop.bank;

public class Driver1 
{
		public static void main(String[] args) 
		{
     // 2. Create an array of SBI Bank Customers with sample data
		Customer[] customers = 
		{
         new Customer("Amit Sharma", 1500.50, "9876543210"),
         new Customer("Priya Patel", 5000.00, "8765432109"),
         new Customer("Rahul Verma", 850.00, "7654321098"),
         new Customer("Sneha Reddy", 12000.75, "6543210987"),
         new Customer("Vikram Singh", 1999.00, "5432109876")
		};

    
		System.out.println("--- Customers with balance less than 2000 ---");

     // 3. for loop list of customers
		for (int i = 0; i < customers.length; i++) {
         
         // 4. Conditional check: Is the balance less than 2000?
         if (customers[i].balance < 2000) {
         
        	 // 5. Print the name and balance of the matching customer
          System.out.println("Name: " + customers[i].name + " | Balance: ₹" + customers[i].balance);
          
         }
     }
  }
}

