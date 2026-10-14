package com.for_loop.max.number; 

public class Max {

    public static void main(String[] args) 
    {
        double [] itemPrice = { 99.20, 55.55, 65.22, 99.10};
        
        // Variable declarations
        double totalCost = 0;
        double maxPrice = itemPrice[0];
        double minPrice = itemPrice[0];

        // 1. Logic for Sum, Max, and Min inside the loop
        for (int i = 0; i < itemPrice.length; i++) 
        {
            // Calculate Total Sum
            totalCost += itemPrice[i];

            // Find Maximum value
            if (itemPrice[i] > maxPrice) {
                maxPrice = itemPrice[i];
            }

            // Find Minimum value
            if (itemPrice[i] < minPrice) {
                minPrice = itemPrice[i];
            }
        }

        // 2. Logic to calculate Average 
        double averagePrice = totalCost / itemPrice.length;

        // --- Printing all calculated results ---
        System.out.println("1. Total Price (Sum): " + totalCost);
        System.out.println("2. Average Price: " + averagePrice);
        System.out.println("3. Maximum Price: " + maxPrice);
        System.out.println("4. Minimum Price: " + minPrice);

        // 3. Logic to check for Even and Odd numbers
        System.out.println("\n--- Even and Odd Check (Integers) ---");
        for (int i = 0; i < itemPrice.length; i++) 
        {
            // Typecast double to int to check even/odd status (e.g., 99.20 -> 99)
            int intValue = (int) itemPrice[i]; 

            if (intValue % 2 == 0) {
                System.out.println(itemPrice[i] + " (Integer part: " + intValue + ") is EVEN.");
            } else {
                System.out.println(itemPrice[i] + " (Integer part: " + intValue + ") is ODD.");
            }
        }
    }
}
